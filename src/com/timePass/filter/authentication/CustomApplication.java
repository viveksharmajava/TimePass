package com.timePass.filter.authentication;

import java.util.HashSet;
import java.util.Set;

import org.glassfish.jersey.server.ResourceConfig;

import com.sun.jersey.api.client.filter.LoggingFilter;
 
public class CustomApplication extends ResourceConfig 
{
	public CustomApplication() 
    {
        packages("com.timePass.filter.authentication");
        Set classes = new HashSet();
        classes.add(LoggingFilter.class);
        classes.add(AuthenticationFilter.class);
        //classes.add(GsonMessageBodyHandler.class);
        addClasses(classes);
       // register(GsonMessageBodyHandler.class);
 
        //Register Auth Filter here
     //   register(AuthenticationFilter.class);
    }
}
