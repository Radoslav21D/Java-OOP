package Vector;

import java.util.Scanner;

public class vector {
	static Scanner sc= new  Scanner(System.in);
	
	private double x;
	
	private double y;
	
	private double z;
	
	public vector() {
		x=sc.nextDouble();
		y=sc.nextDouble();
		z=sc.nextDouble();
				
	}
	
	public vector(double x1,double y1, double z1) {
		this.x=x1;
		this.y=y1;
		this.z=z1;
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

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public void printV() {
		System.out.println(x + "," + y + "," + z);
	}
	
	public double returnSizeV() {
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public vector sum(vector v) {
		vector v1=new vector(this.x+v.x,this.y+v.y,this.z+v.z);
		return v1;
	}
	
	public vector subs(vector v) {
		vector v1=new vector(this.x-v.x,this.y-v.y,this.z-v.z);
		return v1;
	}
	
	public vector pEc(double i) {
		vector v1=new vector(this.x*i,this.y*i,this.z*i);
	    return v1;
	}
	
	public double sPdV(vector v) {
		double sP = Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z)*Math.sqrt(v.x*v.x+v.y*v.y+v.z*v.z)*((this.x*v.x+this.y*v.y+this.z*v.z)/Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z)+Math.sqrt(v.x*v.x+v.y*v.y+v.z*v.z));
		return  sP;
	}
	
	public vector vPdV(vector v) {
		vector v1=new vector(this.y*v.z-this.z*v.y,-1*(this.x*v.y-this.y*v.x),this.x*v.y-this.y*v.x);
		return v1;
	}
	
	public double spdv1(vector v) {
		double sP = this.x*v.x+this.y*v.y+this.z*v.z;
		return sP;
	}
	

}
