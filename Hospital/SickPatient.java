package Hospital;

public class SickPatient extends Patient{
	
	private String epikriza;
	private boolean isSick;
	private int day;
	
	public SickPatient(String n, String a, String egn, String ep, boolean isSick, int day) {
		
		super(n,a,egn);
		this.epikriza=ep;
		this.isSick=isSick;
		this.day=day;
		
	}
	public String toString() {
		
		return super.toString()+ epikriza + " " + isSick + " " + day;
		
	}
	
	public void cure(String med,int dose) {
	
			epikriza=epikriza.concat(" " + med + " e prieto v doza " + dose + ". " );
		
		
	}

}
