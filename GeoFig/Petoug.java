package GeoFig;

public class Petoug extends Shape{
	double a;
	public Petoug(double a) {
		this.a=a;
	}
	public double Perimetar() {
		return 5*a;
	}
	public double Lice() {
		return ((Math.sqrt(25+10*Math.sqrt(5)))/4)*Math.pow(a, 2);
	}

}