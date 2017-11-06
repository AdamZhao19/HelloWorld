package com.tengyun.wan.test.helloworld;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld
{
    private static Logger logger = Logger.getLogger(HelloWorld.class);
    
    public static void main(String[] args)
    {
        logger.debug("Enter HelloWorld.main() method.");
        System.out.println("Hello World!");
    }
    
}
