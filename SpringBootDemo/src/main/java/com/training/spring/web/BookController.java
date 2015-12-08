package com.training.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.domain.Book;

@RestController
public class BookController {
	
	@RequestMapping("/bookDetails")
	public Book getBook(){
		Book book = new Book();
		book.setTitle("Understanding SpringBoot");
		book.setAuthor("Shristi");
		book.setPrice(989.00);
		return book;
	}
}

