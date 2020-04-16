package com.startup.startupdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksContoller {
	@GetMapping("/book")
	public List<Book> getBook(){
		return Arrays.asList(new Book(111, "ram charitra manash", "tuslsi das"));
		
	}
	

}
