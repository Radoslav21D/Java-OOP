package DOCTOR;

import java.time.LocalDate;

public class MainDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor d1=new Doctor("Petrov");
System.out.println(d1.getName()+" "+d1.getPatientRegistered());
LocalDate d=LocalDate.of(2000, 01,10);
Patient p1=new Patient ("Ivanov",d,10);
d1.registerPatient(p1);
System.out.println(d1.getName()+" "+d1.getPatientRegistered());
Patient p2=new Patient("Dimitrov",d,3);
d1.registerPatient(p2);
/*int n=d1.getPatientRegistered();
for(int i=0;i<n;i++) {
	d1.getPatientList()[i].print();
}*/
System.out.println(d1.getName()+" "+d1.getPatientRegistered());
//System.out.println(d1.average());
//d1.printUpper(5);
	}

}
