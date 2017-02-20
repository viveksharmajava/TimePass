package com.mkyong.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path(value="user")
public class FormParamExample {

	@POST
	@Path(value="/add")
	public Response adduser(@FormParam("name") String userName,@FormParam("age") String aayu){
		
		System.out.println(" name="+userName);
		return Response.status(200).entity("user has registered with name="+userName+"\t has age ="+aayu).build();
		
	}
	
	@GET
	@Path(value="/get")
	 @Produces("application/json")
	public Track getTrackJSON(){
		
		Track track = new Track("440 Volt", "Unknown");
		return track;
	}
}
