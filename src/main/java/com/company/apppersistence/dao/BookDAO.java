package com.company.apppersistence.dao;

import java.util.List;

import com.company.apppersistence.model.Book;

public interface BookDAO {
	
	long save(Book book);
	
	Book get(long id);
	
	List<Book> list();
	
	void update(Book book);
	
	void delete(Long id);

}
