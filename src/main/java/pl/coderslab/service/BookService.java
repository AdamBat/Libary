package pl.coderslab.service;

import java.util.List;

import pl.coderslab.model.Book;

public interface BookService {
	 List<Book> getList();
	 void setList(List<Book> list);
	 Book getById(long id);
	 Book updateBook(long id,String isbn,String title,String author,String publisher,String type);
	 void deleteBook(long id);
}
