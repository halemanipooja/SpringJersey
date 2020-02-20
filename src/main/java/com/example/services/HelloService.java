package com.example.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;


@Path("/hello")
public class HelloService {
	
	@GET
    @Produces("text/plain")
	@Path("/")
    public String hello() {
        return "Hello from Spring";
    }
	
	@GET
    @Produces("text/plain")
	@Path("/{id}")
    public String helloWithParam(@PathParam("id") String id) {
        return "Hello from Spring : "+id;
    }

}
