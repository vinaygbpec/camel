package com.pixel.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyCamelRoute extends RouteBuilder {
    private Logger logger = LoggerFactory.getLogger(MyCamelRoute.class);

    @Override
    public void configure() throws Exception {
       // from("timer:first-timer").transform().constant("Time now:" + LocalDateTime.now()).
         //       process(new SimpleProcessor())
         //       .to("log:first-timer");

    }


}
