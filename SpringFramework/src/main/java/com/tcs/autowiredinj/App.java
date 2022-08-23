package com.tcs.autowiredinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springautowired.xml");
    	
    	Car obj = (Car) context.getBean("car");   
    	obj.drive();
    	
    }
}