package Present;

import java.util.*;

public class Present {
	
	Scanner sc=new Scanner(System.in);
	
	private String Name;
	private double Price;
	private double Height;
	private double Width;
	private String Colour;
	private String Receiver;
	
	public Present(String name, double price, double height, double width, String colour, String receiver) {
		
	Name = name;
	Price = price;
	Height = height;
	Width = width;
	Colour = colour;
	Receiver = receiver;
	
	}
	public String getName() {
		return Name;	
	}
	public void setName(String name) {
		Name=name;	
	}
	public double getPrice() {
		return Price;	
	}
	public void setPrice(double price) {
		Price=price;	
	}
	public double getHeight() {
		return Height;	
	}
	public void setHeight(double height) {
		Height=height;	
	}
	public double getWidth() {
		return Width;	
	}
	public void setWidth(double width) {
		Width=width;	
	}
	public String getColour() {
		return Colour;	
	}
	public void setColour(String colour) {
		Colour=colour;	
	}
	public String getReceiver() {
		return Receiver;	
	}
	public void setReceiver(String receiver) {
		Receiver=receiver;	
	}
}	
	

