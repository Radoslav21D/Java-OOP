package Hospital;

public class testBolanica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SickPatient p=new SickPatient("Radoslav","Stara Zagora","9512181244","Covid",true,300);

	System.out.println(p);
	p.cure("Aviron",10);	
	System.out.println(p);

	}

}
