package com.tcs.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.SpringFramework.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springannotation.xml");
    	
    	/*Vehicle obj = (Vehicle) context.getBean("bike");   
    	obj.drive();*/
    	
    	Tyre t = (Tyre) context.getBean("tyre");
    	System.out.println(t);
    	
    }
}

