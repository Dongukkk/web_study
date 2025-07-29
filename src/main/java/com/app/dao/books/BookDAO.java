package com.app.dao.books;

import java.util.List;

import com.app.dto.books.Book;

public interface BookDAO {

	List<Book> findBookList();
	
	int saveBook(Book book);
	
	Book findBookById(int id);
	
	int removeBook(int id);
	
	int modifyBook(Book book);
}
