package GeoFig;

public class Circle extends Shape{
	private double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	public double Perimetar() {
		return Math.PI*r*2;
	}
	public double Lice() {
		return Math.PI*this.r*r;
	}

}
