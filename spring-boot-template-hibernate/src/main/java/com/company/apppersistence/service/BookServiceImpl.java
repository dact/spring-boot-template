package com.company.apppersistence.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.apppersistence.dao.BookDAO;
import com.company.apppersistence.model.Book;
import com.company.apppersistence.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	//@Autowired
	//private BookDAO bookDAO;
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public long save(Book book) {
		return bookRepository.save(book).getId();
	}

	@Override
	public Book get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Book> list() {
		//return bookDAO.list();
		return null;
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> findAll() {
		Iterable<Book> it = bookRepository.findAll();

		List<Book> books = new ArrayList<Book>();
        it.forEach(e -> books.add(e));

        return books;
	}

}
