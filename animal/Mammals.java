package animal;

public class Mammals extends Creatures {
	private boolean fur;
	private String region;
	
	public Mammals() {
		super();
	}
	public Mammals(boolean f,String r) {
		fur=f;
		region=r;
	}
	public void setFur(boolean f) {
		fur=f;
	}
	public boolean getFur() {
		return fur;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String printInfo() {
		return "\nSize:"+size+"\nAge:"+age+"\nFur:"+getFur()+"\nRegion:"+getRegion();
	}

	

}
