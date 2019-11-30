package com.viso.crypto;

import com.google.crypto.tink.KeyManager;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.proto.KeyData;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class CustomPublicKeySignManager implements KeyManager<PublicKeySign> {

    public PublicKeySign getPrimitive(ByteString serializedKey) throws GeneralSecurityException {
        return null;
    }

    public PublicKeySign getPrimitive(MessageLite key) throws GeneralSecurityException {
        return null;
    }

    public MessageLite newKey(ByteString serializedKeyFormat) throws GeneralSecurityException {
        return null;
    }

    public MessageLite newKey(MessageLite keyFormat) throws GeneralSecurityException {
        return null;
    }

    public boolean doesSupport(String typeUrl) {
        return false;
    }

    public String getKeyType() {
        return null;
    }

    public int getVersion() {
        return 0;
    }

    public Class<PublicKeySign> getPrimitiveClass() {
        return null;
    }

    public KeyData newKeyData(ByteString serializedKeyFormat) throws GeneralSecurityException {
        return null;
        Map<String, String> map = new ConcurrentHashMap<String, String>();

    }
}
