package Car;

import java.util.*;

public class Car {
	Scanner sc=new Scanner(System.in);
	
	private double Brand;
	private double Model;
	private double Colour;
	private double Engine;
	private double Price;
	private double Date;
	
	public Car(double brand, double model, double colour, double engine, double price, double date) {
		Brand = brand;
		Model = model;
		Colour = colour;
		Engine = engine;
		Price = price;
		Date = date;
}
	public double getBrand() {
		return Brand;
	}
	public void setBrand(double brand) {
		Brand=brand;
	}
	public double getModel() {
		return Model;
	}
	public void setModel(double model) {
		Model=model;
	}
	public double getColour() {
		return Colour;
	}
	public void setColour(double colour) {
		Colour=colour;
	}
	public double getEngine() {
		return Engine;
	}
	public void setEngine(double engine) {
		Engine=engine;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price=price;
	}
	public double getDate() {
		return Date;
	}
	public void setDate(double date) {
		Date=date;
	}
}
