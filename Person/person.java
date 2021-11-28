package Person;

import java.util.Scanner;

public class person {
	static Scanner sc=new Scanner(System.in);
	private String name;
	private String lname;
	private int age;
	
	public person() {	
		name=sc.next();
		this.lname=sc.next();
		this.age=sc.nextInt();
	}
	public person(String n,String ln,int a) {
		this.name=n;
		this.lname=ln;
		this.age=a;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public String getLName() {
		return this.lname;
	}
	public void setLname(String ln) {
		this.lname=ln;
	}
	public void setAge(int a) {
		age=a;
	}
	public int getAge() {
		return this.age;
	}
	public void PrintData() {
		System.out.print(name+" "+lname+" "+age);
		System.out.println();
	}

}
