public class Orb implements Figure2{
	private double p;
	private double r;
	
	public Orb(double p,double r) {
		this.p = p;
		this.r = r;
	}

	@Override
	public void s() {
		 System.out.println("S="+4*p*(r*r));
		
	}

	@Override
	public void v() {
		System.out.println("V="+(4/3)*p*(r*r*r));
		
	}

	}

