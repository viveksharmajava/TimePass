package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/path")
public class PathUriMatchingExample {
	
	@GET
	public Response getPathUri(){
		
		return Response.status(200).entity("Normal Uril Matching").build();
	}
	@GET
	@Path("/country")
	public Response getPathUriCountry(){
		
		return Response.status(200).entity(" Nested Uril Mappingi").build();
	}
	
	@GET
	@Path("/country/{countryName}")
	public Response getCountryByName(@PathParam("countryName") String country){
		return Response.status(200).entity("Country name="+country).build();
	}

}
