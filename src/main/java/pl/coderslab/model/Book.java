package pl.coderslab.model;

public class Book {
	private long id;
	private String isbn;
	private String title;
	private String author;
	private String publsher;
	private String type;
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", publsher="
				+ publsher + ", type=" + type + "]";
	}
	public Book() {
		super();
	}
	public Book(long id, String isbn, String title, String author, String publsher, String type) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publsher = publsher;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublsher() {
		return publsher;
	}
	public void setPublsher(String publsher) {
		this.publsher = publsher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
