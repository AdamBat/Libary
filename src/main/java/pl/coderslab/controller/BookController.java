package pl.coderslab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.model.Book;
import pl.coderslab.service.BookService;
import pl.coderslab.service.MemoryBookService;

@RestController
@RequestMapping("/books")
public class BookController {
	@Autowired
	BookService mbs;

	@RequestMapping("/hello")
	public String hello() {
		return "{Hello World}";
	}

	@RequestMapping("/bookHello")
	public Book bookhello() {
		return new Book(1L, "44235235", "someTitle", "John Dickens", "BestPublisher", "action");
	}

	@GetMapping("/")
	public List<Book> getAll() {
		return mbs.getList();
	}

	@GetMapping("/{id}")
	public Book getById(@PathVariable("id") long id) {
		return mbs.getById(id);
	}

	@PostMapping("/")
	public List<Book> addBook(@RequestParam("id") long id, @RequestParam("isbn") String isbn,
			@RequestParam("title") String title, @RequestParam("author") String author,
			@RequestParam("publsher") String publisher, @RequestParam("type") String type) {
		List<Book> books = mbs.getList();
		books.add(new Book(id, isbn, title, author, publisher, type));
		return books;
	}

	@DeleteMapping("/{id}")
	public List<Book> deleteBook(@PathVariable("id") long id) {
		List<Book> books = mbs.getList();
		mbs.deleteBook(id);
		return books;
	}
	@PutMapping("/{id}")
	public Book updateBook(@RequestParam("id") long id, @RequestParam("isbn") String isbn,
			@RequestParam("title") String title, @RequestParam("author") String author,
			@RequestParam("publsher") String publisher, @RequestParam("type") String type) {
		Book book = mbs.getById(id);
		book.setAuthor(author);
		book.setIsbn(isbn);
		book.setPublsher(publisher);
		book.setTitle(title);
		book.setType(type);
		return book;
	}

}
