//package netgloo.controllers;
//
//import io.micrometer.core.instrument.DistributionSummary;
//import io.micrometer.core.instrument.MeterRegistry;
//import io.micrometer.core.instrument.composite.CompositeMeterRegistry;
//import io.micrometer.prometheus.PrometheusMeterRegistry;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//// import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class MainController {
//
//    private final DistributionSummary ds;
//
//    public MainController(final MeterRegistry registry) {
//        this.ds = DistributionSummary.builder("greeting_summary")
//                .description("simple distribution summary")
//                .minimumExpectedValue(1L)
//                .maximumExpectedValue(10L)
//                .publishPercentiles(0.5, 0.75, 0.9)
//                .register(registry);
//    }
//
//    @RequestMapping("/")
//    // @ResponseBody
//    public String index() {
//        ds.record(Math.random() * 10);
//        System.out.println(ds.takeSnapshot().toString());
//        return "hello.html";
//    }
//
//}
