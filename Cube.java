public class Cube implements Figure2 {
	private double a;
	
	public Cube(double a) {
		this.a = a;
	}

	@Override
	public void s() {
		System.out.println("S="+6*a*a);
		
	}

	@Override
	public void v() {
		System.out.println("V="+a*a*a);
		
	}
	

	}

