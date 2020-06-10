package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	private static final String String = null;
	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> rueda = new ArrayList<Wheel>();
	
	
//constructor//construye el objeto//
	
	public  Vehicle(String plate, String brand, String color) {
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;
        
	}
//Metodo//
		
	public String getPLate() {	return plate; }
	public String getBrand() { return brand; }
	public String getColor() { return color; }		
		
		
	}
	
