package com.rest.Filter;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class CustomApplication extends ResourceConfig
{
    public CustomApplication() 
    {
        packages("com.rest");
 
        register(JacksonFeature.class);
        //Register Auth Filter here
        register(AuthenticationFilter.class);
        
        
    }
}
