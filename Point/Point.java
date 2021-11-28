package Point;

import java.util.Scanner;

public class Point {
static Scanner sc=new Scanner(System.in);
	private double x;
	private double y;
	public Point() {
		x=sc.nextDouble();
		y=sc.nextDouble();
	}
	public Point(double x1,double y1) {
		this.x=x1;
		this.y=y1;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public String Kv() {
		String rezult="";
		if(x==0 && y==0) {rezult="Nachalo na koord. sistema";}
		else {
			if(x==0) {
				rezult="Oy";}
			else {
				if(y==0) {
				rezult="Ox";}
				else {
					if(x>0) {
						if(y>0) {
							rezult="I kvadrant.";}
						else 
							if(y<0) {
								rezult="IV kvadrant.";
								}
			
							}
					else {
						if(y>0) {
					
						rezult="II kvadrant.";}
					else 
						if(y<0) {
							rezult="III kvadrant.";
							}
		
						}
						
					}
				}
			}
		return rezult;
	}
}


