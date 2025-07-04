package com.bpi;

import com.bpi.services.DemoService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/demo")
public class DemoResource {

    @Inject
    DemoService demoService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String demo() {
        return demoService.getGreeting();
    }
}
