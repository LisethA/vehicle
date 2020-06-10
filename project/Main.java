package com.vehicles.project;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {

	public static void main(String[] args) {
		
		String TipoVehiculo;
		String brand; 
		String color;
		String plate;
		Boolean esMarca = true;
		
		Car car;
		Bike bike;
		
		
		List<Wheel>frontWheels;
		List<Wheel>backWheel;
		
		System.out.println("Seleccione un vehiculo");
		Scanner sc= new Scanner(System.in);
		TipoVehiculo= sc.next();
		
		/*Wheel w1;
		Wheel w2;
		Wheel w3;
		Wheel w4;
		*/
		
		System.out.println("Introduce la marca:");
		brand = sc.next();
		System.out.println("Introduce el color:");
		color = sc.next();
		System.out.println("Introduce la matricula:");
		plate = sc.next().toLowerCase();
		
		
		Pattern p= Pattern.compile("\\d\\d\\d\\d [A-Z][A-Z][A-Z][A-Z]");
		Matcher m= p.matcher(plate);
		esMarca=m.find();
		if(!esMarca) {
		System.out.println(plate + "no es valido");
		}
	while(esMarca=true);
		
		
		System.out.println(car.toString());
		System.out.println("Introduce las ruedas traseras");
		car.Wheel.add(CreateWheel(sc));
		car.Wheel.add(CreateWheel(sc));
		
		System.out.println(car.toString());
		System.out.println("Introduce las ruedad delanteras");
		car.Wheel.add(CreateWheel(sc));
		car.Wheel.add(CreateWheel(sc));
	

	 public static Wheel CreateWheel(Scanner sc) {
	 
	 //Vehicle v= new Car(1.5,"","","");
	 
	 //((Car )v).
		 
	 Scanner sc1 = new Scanner(System.in);
		System.out.println("Marca");
		
		String marca = sc.next();
		System.out.println("diametro");
		
		double diametro= sc.nextDouble();
		
		Wheel wheel=new Wheel(marca,diametro);
		
		return wheel;
	 }
}
	
