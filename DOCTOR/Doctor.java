package DOCTOR;

public class Doctor {

private String Name;
private Patient []PatientsList=new Patient[100];
private int PatientsRegistered;


public Doctor(String name) {
	Name=name;
	PatientsRegistered=0;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Patient[] getPatientList() {
	return PatientsList;
}
public void setPatientList(Patient[] patientList) {
	PatientsList = patientList;
}
public int getPatientRegistered() {
	return PatientsRegistered;
}
public void setPatientRegistered(int patientRegistered) {
	PatientsRegistered = patientRegistered;
}
public void registerPatient(Patient p) {
	PatientsList[PatientsRegistered]=p;
	PatientsRegistered++;
	
}
}