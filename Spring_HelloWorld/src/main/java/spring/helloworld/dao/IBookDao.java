package main.java.spring.helloworld.dao;

import java.util.List;

import main.java.spring.helloworld.model.Book;

public interface IBookDao {

	List<Book> findAll();
	Book newBook(Book newBook);
}
