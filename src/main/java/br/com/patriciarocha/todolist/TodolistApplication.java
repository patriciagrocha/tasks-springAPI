package br.com.patriciarocha.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
        //entrypoint da aplicação
		SpringApplication.run(TodolistApplication.class, args);
	}

}
