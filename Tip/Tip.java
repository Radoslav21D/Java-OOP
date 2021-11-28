package Tip;

import java.util.*;

public class Tip {
	Scanner sc=new Scanner(System.in);
	private String size;
	private String price;
	public Tip() {
		size = "small";
		price = "cheap";
		
	}
	public Tip(String s, String p) {
		size = s;
		price = p;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice( ) {
		return price;
	}
	public void setPrice(String price) {
		this.price=price;
	}
	public void Start() {
		System.out.println("House");
		System.out.println("The house is " + size);
	}
	public void Name(String name) {
		System.out.println("The house is for " + size);
	}
	public void Colour(String Colour) {
		System.out.println("The house is " + Colour + " colour");
	}
	public void Price(double cn) {
		System.out.println("The house is " + price + " and it cost " + cn + " lv.");
	}
	public void Type(String v) {
		System.out.println("The house is " + v);
		
	}
}
