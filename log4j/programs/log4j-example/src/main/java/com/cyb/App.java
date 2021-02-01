package com.cyb;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

 

public class App 
{
    public static final Logger log = LogManager.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	log.debug("debug message");
        log.info("this is just info message...");
        log.warn("warning message");
        log.error("error");
        
    }
}
