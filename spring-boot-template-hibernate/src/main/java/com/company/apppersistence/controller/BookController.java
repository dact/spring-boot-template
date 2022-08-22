package com.company.apppersistence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.apppersistence.model.Book;
import com.company.apppersistence.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list(){
		//List<Book> list = bookService.list();
		List<Book> list = bookService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/api/book")
	public ResponseEntity<?> save(@RequestBody Book book){
		//List<Book> list = bookService.list();
		long id = bookService.save(book);
		return ResponseEntity.ok().body("Book Created with id:"+id);
	}
	
}
