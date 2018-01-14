package pl.coderslab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import pl.coderslab.model.Book;

@Component
public class MemoryBookService implements BookService {
	private List<Book> list;

	public MemoryBookService() {
		list = new ArrayList<>();
		list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"));
		list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.", "Sierra Kathy, Bates Bert", "Helion",
				"programming"));
		list.add(new Book(3L, "9780130819338", "Java 2. Podstawy", "Cay Horstmann, Gary Cornell", "Helion",
				"programming"));
	}

	public List<Book> getList() {
		return list;
	}

	public void setList(List<Book> list) {
		this.list = list;
	}
	public Book getById(long id) {
		Book book = new Book();
		list = this.getList();
		for(Book b:list) {
			if(b.getId() == id) {
				book = b;
			}
		}
		return book;
	}
	
	public Book updateBook(long id,String isbn,String title,String author,String publisher,String type) {
		Book book = this.getById(id);
		book.setIsbn(isbn);
		book.setAuthor(author);
		book.setPublsher(publisher);
		book.setType(type);
		book.setTitle(title);
		return book;
	}
	
	public void deleteBook(long id) {
		list.removeIf(i->i.getId()==id);
	}
}