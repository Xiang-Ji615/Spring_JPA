package main.java.spring.helloworld.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import main.java.spring.helloworld.model.Book;
import main.java.spring.helloworld.util.BookRepository;

@Repository
public class BookDaoImp implements IBookDao {
	
	@Autowired
	BookRepository repo;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Book newBook(Book newBook) {
		// TODO Auto-generated method stub
		return repo.save(newBook);
	}

}
