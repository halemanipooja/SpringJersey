package com.example.services;

import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
@Service
@Path("/reverse")
public class ReverseService {

    @GET
    @Produces("text/plain")
    public String reverse(@QueryParam("data") @NotNull String data) {
        return new StringBuilder(data).reverse().toString();
    }
    
    @GET
    @Path("/pathparam/{data1}")
    @Produces("text/plain")
    public String getData(@PathParam("data1") String msg) {
    	System.out.println("Sdfssde");
    	System.out.println(msg);
    	StringBuilder res = new StringBuilder("got the data: ");
    	res.append(msg);
    	return res.toString();
    }
}