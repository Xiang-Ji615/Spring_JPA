package main.java.spring.helloworld.app;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.google.gson.Gson;

import main.java.spring.helloworld.model.Book;
import main.java.spring.helloworld.util.BookRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "main.java.spring.helloworld.util")
@ComponentScan(basePackages = { "main.java" })
@EntityScan(basePackages = { "main.java" })
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(BookRepository repository) {
		return args -> {
			repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new BigDecimal("15.41")));
			repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new BigDecimal("9.69")));
			repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler",
					new BigDecimal("47.99")));
			System.out.println(new Gson().toJson(new Book("Jasper test book", "Test Book", new BigDecimal(123))));
		};
	}

}
