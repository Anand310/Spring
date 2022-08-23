package com.tcs.annotation;

import org.springframework.stereotype.Component;

import com.tcs.SpringFramework.Vehicle;
@Component
public class Bike implements Vehicle{
	
	public void drive() {
		System.out.println("Bhaag raha hai.....");
	}
}
