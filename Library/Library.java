package Library;

import java.util.ArrayList;

public class Library {
private String name;
private ArrayList <Book> books;

public Library(String name){
	this.name=name;
	this.books=new ArrayList<>();
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public ArrayList<Book> getBooks() {
	return books;
}

public void setBooks(ArrayList<Book> books) {
	this.books = books;
}
public void addBook(Book b) {
	books.add(b);
}
public ArrayList <Book> getBooksbyAutor(String nameAutor){
	ArrayList <Book> booksAutor=new ArrayList();
	for(Book b:books) {
		if(b.getAutor().equals(nameAutor)) {
			booksAutor.add(b);
		}
	}
	return booksAutor;
		}
public void removeBook(String nameAutor) {
	ArrayList <Book> booksN=new ArrayList();
	for(Book b:books) {
		if(!b.getAutor().equals(nameAutor)) {
			booksN.add(b);
		}
		books=booksN;
	}
}
	}
	


