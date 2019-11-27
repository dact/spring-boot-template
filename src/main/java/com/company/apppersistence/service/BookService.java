package com.company.apppersistence.service;

import java.util.List;

import com.company.apppersistence.dao.BookDAO;
import com.company.apppersistence.model.Book;

public interface BookService extends BookDAO{

	List<Book> findAll();
	
}
