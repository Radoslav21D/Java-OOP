package Hospital;

public abstract class Patient {
	
private String name;
private String address;
private String EGN;

public Patient(String n, String a, String egn) {
	
	this.name=n;
	this.address=a;
	this.EGN=egn;
}
public String toString() {
	
	return name + " " + address + " "+ EGN + "\n";
}

public abstract void cure(String med,int dose);

}
