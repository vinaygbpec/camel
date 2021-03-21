package com.pixel.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyCamelRoute extends RouteBuilder{

    @Override
    public void configure() throws Exception {
       from("timer:first-timer")
       .to("log:first-timer");
        
    }
    

}
