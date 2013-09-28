package com.dmitrynikol.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dmitrynikol.model.User;
import com.dmitrynikol.model.Users;

/**
 * Represent a class that will be manipulated by different HTTP methods.
 * 
 * @author Dmitry Nikolaenko
 *
 */
@Path("users")
public class UserRestService {
	
	private static Map<Integer, User> users = new HashMap<Integer, User>();
	private int index = 5;
	
	static {
		users.put(1, new User(1, "Tom", "Jenkins"));
		users.put(2, new User(2, "Den", "Farel"));
		users.put(3, new User(3, "Lee", "Choa"));
		users.put(4, new User(4, "Max", "Italiano"));
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public User getUser(@PathParam("id") Integer id) {
		return users.get(id);
	}
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Users getAll() {
		return new Users(users.values());
	}
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addUser(User user) {
		user.setId(index++);
		users.put(index++, user);
		return Response.ok().build(); 
	}
	
	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("id") Integer id) {
		User user = users.get(id);
		if (user != null) {
			user.setFirstName("Sam");
			user.setLastName("Fisher");
		}
		return Response.ok().build(); 
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Response deleteUser(@PathParam("id") Integer id) {
		users.remove(id);
		return Response.ok().build(); 
	}
}