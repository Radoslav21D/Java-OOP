package DOCTOR;

import java.time.LocalDate;
import java.util.Scanner;

public class Patient {
	
	static Scanner sc=new Scanner(System.in);
	
private String Name;
private LocalDate DOB;
private int Visits;

public Patient() {
	Visits=0;
}

public Patient(String n, LocalDate d, int v) {
	Name=n;
	DOB=d;
	Visits=v;
}

public void print() {
	System.out.println(Name);
	System.out.println(DOB);
	System.out.println(Visits);
}

public String getName() {
	return Name;
}
public void setName(String name) {
	Name=name;
}

public LocalDate getDOB() {
	return DOB;
}

public void setDOB(LocalDate dOB) {
	DOB=dOB;
}

public int getVisits() {
	return Visits;
}

public void setVisits(int visits) {
	Visits=visits;
}

}
