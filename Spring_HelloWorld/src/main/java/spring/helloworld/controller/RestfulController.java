package main.java.spring.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.spring.helloworld.dao.IBookDao;
import main.java.spring.helloworld.model.Book;

@RestController
@RequestMapping(value = {"Rest/V1"})
@CrossOrigin
public class RestfulController {

	@Autowired
	IBookDao dao;
	
	@GetMapping("Books")
	public List<Book> findAll(){
		return dao.findAll(); 
	}
	
	@PostMapping("Books")
	public Book newBook(@RequestBody Book newBook) {
		return dao.newBook(newBook);
	}
}
