package com.timePass.filter.authentication;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
@Provider
public class AuthenticationFilter implements javax.ws.rs.container.ContainerRequestFilter{

	 @Context
	 ResourceInfo resourceInfo;
	 
	 private static final String AUTHORIZATION_PROPERTY= "Authorization";
	 private static final String AUTHENTICATION_SCHEME ="Basic";
	 private static final Response ACCESS_DENIED =Response.status(Response.Status.UNAUTHORIZED).build();
	 private static final Response ACCESS_FORBIDDEN =Response.status(Response.Status.FORBIDDEN).build();
	@Override
	public void filter(ContainerRequestContext requestContext) {
		
		System.out.println("AuthenticationFilter");
		Method method  = resourceInfo.getResourceMethod();
		//Access Allowed for all
		if(! method.isAnnotationPresent(PermitAll.class)){
			//Access Deny to all request
			if(method.isAnnotationPresent(DenyAll.class)){
				requestContext.abortWith(ACCESS_FORBIDDEN);
				return;
			}
		}
		//Get Request header
		
		
		final MultivaluedMap<String, String> headers = requestContext.getHeaders();
		//Fetch Authorization header
		
		List <String> authorizationList = headers.get(AUTHORIZATION_PROPERTY);
		
		if(authorizationList == null || authorizationList.isEmpty()){
			requestContext.abortWith(ACCESS_DENIED);
			return;
		}
		
		
		//Get encoded username and password
		
		String userNameAndPassword =  authorizationList.get(0).replaceFirst(AUTHENTICATION_SCHEME, ",");
		final StringTokenizer  token = new StringTokenizer(userNameAndPassword,":");
		String userName = token.nextToken();
		String password = token.nextToken();
		
		System.out.println("userName ="+userName+"\t password="+password);
		isUserAllowed(userName,password,null);
		
	}
	
	
	 private boolean isUserAllowed(final String username, final String password, final Set<String> rolesSet)
	    {
	        boolean isAllowed = false;
	        System.out.println("AuthenticationFilter isUserAllowed");
	        //Step 1. Fetch password from database and match with password in argument
	        //If both match then get the defined role for user from database and continue; else return isAllowed [false]
	        //Access the database and do this part yourself
	        //String userRole = userMgr.getUserRole(username);
	         
	        if(username.equals("howtodoinjava") && password.equals("password"))
	        {
	            String userRole = "ADMIN";
	            isAllowed = true;
	            //Step 2. Verify user role
	            /*if(rolesSet.contains(userRole))
	            {
	                isAllowed = true;
	            }*/
	        }
	        return isAllowed;
	    }

}
