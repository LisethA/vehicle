package com.vehicles.project;

import java.util.Scanner;

public class Wheel {
	private String marca;
	private double diametro;

	public Wheel(String marca, double diametro) {
		this.marca = marca;
		this.diametro = diametro;
		
	}
	public static Wheel CreateWheel(Scanner sc) {
			 
			 
			 Scanner sc1 = new Scanner(System.in);
				System.out.println("Marca");
				
				String marca = sc.next();
				System.out.println("diametro");
				
				double diametro= sc.nextDouble();
				
				Wheel wheel=new Wheel(marca,diametro);
				
				return wheel;
			 }
		}

