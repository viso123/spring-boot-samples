package com.viso.crypto;

import com.google.crypto.tink.*;
import com.google.crypto.tink.aead.AeadFactory;
import com.google.crypto.tink.config.TinkConfig;
import com.google.crypto.tink.signature.SignatureKeyTemplates;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

@SpringBootTest
public class TinkerTest {
    @Test
    public void testKeygen() throws GeneralSecurityException, IOException {
        TinkConfig.register();
        // 1. Generate the private key material.
        KeysetHandle privateKeysetHandle = KeysetHandle.generateNew(
                SignatureKeyTemplates.ECDSA_P256);

        // 2. Get the primitive.
        PublicKeySign signer = privateKeysetHandle.getPrimitive(PublicKeySign.class);

        String dataString = "viso123";
        String fakeDataString = "viso124";
        // 3. Use the primitive to sign.
        byte[] signature = signer.sign(dataString.getBytes());

        // VERIFYING

        // 1. Obtain a handle for the public key material.
        KeysetHandle publicKeysetHandle =
                privateKeysetHandle.getPublicKeysetHandle();
        publicKeysetHandle.writeNoSecret(JsonKeysetWriter.withFile(new File("D:/test_pub.json")));
        // 2. Get the primitive.
        PublicKeyVerify verifier = publicKeysetHandle.getPrimitive(PublicKeyVerify.class);


        publicKeysetHandle.writeNoSecret(JsonKeysetWriter.withFile(new File("D:/test_pub1.json")));
        // 4. Use the primitive to verify.
        try {
            verifier.verify(signature, dataString.getBytes());
            System.out.println("valid");
        } catch (GeneralSecurityException e) {
            System.out.println("invalid");
        }

    }
}
