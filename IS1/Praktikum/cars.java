package IS1.Praktikum;

import java.util.Scanner;

public class cars {
	 static Scanner sc=new Scanner(System.in);
     private String model,fuel;
     private String date;
     private double price,consumption;
     
     public cars(){
    		model=sc.next();
    		fuel=sc.next();
    		date=sc.next();
    		price=sc.nextDouble();
    		consumption=sc.nextDouble();
    		}
     public cars(String m,String f,String d,double p,double c) {
    	 this.model=m;
    	 this.fuel=f;
    	 this.date=d;
    	 this.price=p;
    	 this.consumption=c;
     }
    	 
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getConsumption() {
		return consumption;
	}
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	public void getInfo() {
		System.out.println(model);
		System.out.println(fuel);
		System.out.println(date);
		System.out.println(price);
		System.out.println(consumption);
		System.out.println();
	}
}
