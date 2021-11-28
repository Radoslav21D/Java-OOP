package Library;



public class Library1 {

	private String name;
	private Book []books=new Book[1000];
	private int regBook;
	
	public Library1(String name) {
		this.name=name;
		regBook=0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public int getRegBook() {
		return regBook;
	}
	public void setRegBook(int regBook) {
		this.regBook = regBook;
	}
	public void addBook(Book b) {
		books[regBook]=b;
		regBook++;
		
	}
	public void removeBook(String name1) {
	Book []b1=new Book[regBook];
	int j=0;
		for(int i=0;i<regBook;i++) {
			if(!books[i].getAutor().equals(name1)) {
				b1[j]=books[i];
				j++;
				}
							
		}
		this.books=b1;
		regBook=j;		
	}
}
