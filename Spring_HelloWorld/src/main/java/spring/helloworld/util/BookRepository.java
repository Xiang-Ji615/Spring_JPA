package main.java.spring.helloworld.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.spring.helloworld.model.Book;

@Repository
//@Transactional
public interface BookRepository extends JpaRepository<Book, Long>{

}
