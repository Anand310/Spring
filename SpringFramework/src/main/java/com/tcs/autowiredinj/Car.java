package com.tcs.autowiredinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tcs.SpringFramework.Vehicle;

@Component
public class Car implements Vehicle{
	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void drive() {
		System.out.println("Car "+ tyre);
	}
}
