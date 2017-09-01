package com.test.jaxrs.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.jaxrs.bean.User;
import com.test.jaxrs.dao.UserDao;

@Path("/user")
public class UserService {

	@GET
	@Path("/getUsersInXML")
	@Produces(MediaType.APPLICATION_XML)
	public List<User> getUsersInXML() {

		return new UserDao().getAllUsers();

	}
	
	@GET
	@Path("/getUsersInJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public List< User > getUsersInJSON() {
		return new UserDao().getAllUsers();
	}
	
	// following code also will do same as above method
//	@GET
//	@Path("/getUsersInJSON")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getUsersInJSON() {
//	    GenericEntity< List< User > > entity;
//	    entity  = new GenericEntity< List< User > >( new UserDao().getAllUsers() ) { };
//	    return Response.ok( entity ).build();
//	}
	
	@GET
	@Path("/getUsersInTEXT")
	@Produces(MediaType.TEXT_PLAIN)  
	public String getUsersInTEXT() {

		return new UserDao().getAllUsers().toString();

	}
	
	@GET
	@Path("/getOneUserInJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public User getOneUserInJSON() {
		return new UserDao().getOneUser();
	}
	
	
	@GET @Path("details/")
	@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN })
	public List<User> details() {
	    return new UserDao().getAllUsers();
	}
}