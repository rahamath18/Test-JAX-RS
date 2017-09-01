package com.test.jaxrs.helloworld;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}") 
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("/sayHello") 
	public Response sayHello() {

		String output = "Welcome to JAX-RS!";

		return Response.status(200).entity(output).build();

	}
	
	@GET
	@Path("/sayHelloInJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sayHelloInJSON() {

		String output = "Welcome to JAX-RS JSON Format!";

		return Response.status(200).entity(output).build();

	}
		 
}