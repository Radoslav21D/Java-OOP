package GeoFig;

import java.util.Scanner;

public class Triangle extends Shape {
	static Scanner sc = new Scanner(System.in);
	private double a;
	private double b;
	private double c;

	

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	} 	
	

	public double Lice() {
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	public double Perimetar() {
		return a+b+c ;
		
	}
	
}
