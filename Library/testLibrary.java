package Library;

import java.util.Scanner;

public class testLibrary {
	static Scanner sc=new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library1 l1=new Library1 ("Kliment Ohridski");
		//Library l1=new Library ("Kliment Ohridski");
		/*System.out.print("Въведете заглавие на книгата:");
		String t=sc.nextLine();
		System.out.print("Въведете автор:");
		String a=sc.nextLine();
		System.out.print("Въведете година на издаване:");
		int year=sc.nextInt();
		System.out.print("Въведете код:");
		String i=sc.next();
		Book b=new Book(t,a,year,i);*/
		Book b1=new Book("A","A",2000,"123456781");
		Book b2=new Book("AA","A",2010,"123456782");
		Book b3=new Book("AAA","A",2020,"123456783");
		Book b4=new Book("B","B",2000,"123456784");
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.addBook(b4);
		System.out.println("--------------------");
		for(int i=0;i<l1.getRegBook();i++) {
			l1.getBooks()[i].print();
		}
		l1.removeBook("B");
	/*	for(Book b:l1.getBooks()) {
			b.print();
		}*/
		System.out.println("--------------------");
		for(int i=0;i<l1.getRegBook();i++) {
			l1.getBooks()[i].print();
		}
		System.out.println("--------------------");
		/*for(Book b:l1.getBooksbyAutor("A")) {
			b.print();
		}
		System.out.println("--------------------");
		for(Book b:l1.getBooks()) {
			b.print();
		}
		System.out.println("--------------------");
		l1.removeBook("A");
		for(Book b:l1.getBooks()) {
			b.print();
		}
		
	}*/

	}}
