package com.springboot.basics.springbootproject1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import net.bytebuddy.implementation.MethodCall.ArgumentLoader.ForField;

@RestController
public class BooksController {
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(
				new Book(1l, 
						"Symfonia C++",
						"Jerzy Grzębosz"));
		
	}
	
}
