package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.hibernate.SessionFactory;

import com.timePass.util.HibernateUtils;
 
@Path(value="/hello")
public class HelloWorldService {
 
	@GET
	@Path(value="/{param}")
	public Response getMsg(@PathParam("param") String msg) {
    SessionFactory sf = HibernateUtils.getSessionFactory();
		String output = "Jersey say sf : " + sf;
     System.out.println("output="+output);
		return Response.status(200).entity(output).build();
 
	}
	@GET
	@Path(value="/vip")
	public Response getUserVIP() {
		 System.out.println("getUserVIP called=");
		return Response.status(200).entity("getUserVIP is called").build();
	}
	
	
 
}