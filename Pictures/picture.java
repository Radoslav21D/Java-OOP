package Pictures;

import java.util.Scanner;

public class picture {
	private String name,author,DOC,UN;
	private int price;
	public Scanner sc =new Scanner(System.in);
	
	public picture(){
	name=sc.next();
	author=sc.next();
	price=sc.nextInt();
	DOC=sc.next();
	UN=sc.next();
	}
	public picture(String name, String author,  int price,String dOC, String uN) {
		this.name = name;
		this.author = author;
		this.price = price;
		DOC = dOC;
		UN = uN;	
	}
	public String getName() {
		return name;	
	}
	public void setName(String name) {
		this.name = name;	
	}
	public String getAuthor() {
		return author;	
	}
	public void setAuthor(String author) {
		this.author = author;	
	}
	public String getDOC() {
		return DOC;	
	}
	public void setDOC(String dOC) {
		DOC = dOC;	
	}
	public int getPrice() {
		return price;	
	}
	public void setPrice(int price) {
		this.price = price;	
	}
	public String getUN() {
		return UN;		
	}
	public void setUN(String uN) {
		UN = uN;		
	}	
	public void getInfo() {
		System.out.println(name);
		System.out.println(author);
		System.out.println(price);
		System.out.println(DOC);
		System.out.println(UN);
		System.out.println();
	}
		
	}


