package com.vishal.LibraryManagement.LibraryManagement;

import com.vishal.LibraryManagement.LibraryManagement.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BookService bookService = context.getBean("bookService", BookService.class);
		bookService.addBook("Effective Java");
	}

}
