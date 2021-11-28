public class Pyramid implements Figure2{
	private double n;
	private double k;
	private double b;
	private double a;
	private double h;
	
	public Pyramid(double n,double k, double b,double a,double h) {
		this.n = n;
		this.k = k;
		this.b = b;
		this.a = a;
		this.h = h;
		
	}

	@Override
	public void s() {
		double B=(n*b*a)/2;
        double s=(n*b*k)/2;
        System.out.println("S="+s);
        System.out.println("S1="+(s+B));
		
	}

	@Override
	public void v() {
	        double B=(n*b*a)/2;
	        System.out.println("V="+((B*h)/3));
		
	}
		
	}	

