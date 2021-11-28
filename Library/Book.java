package Library;

public class Book {
	private String Title;
	private String Autor;
	private int YearIss;
	private String ISBN;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getYearIss() {
		return YearIss;
	}
	public void setYearIss(int yearIss) {
		YearIss = yearIss;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Book() {
		
	}
	public Book(String title, String autor, int yearIss, String iSBN) {
		this.Title=title;
		this.Autor=autor;
		this.YearIss=yearIss;
		this.ISBN=iSBN;
	}
	public void print() {
		System.out.print(Title+" "+Autor+" "+YearIss+" "+ISBN+"\n");
	}
	
}
