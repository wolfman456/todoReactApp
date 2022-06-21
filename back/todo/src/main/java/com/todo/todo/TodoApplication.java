package com.todo.todo;

import com.todo.todo.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Autowired
    private ToDoRepo toDoRepo;

    @Override
    public void run(String... args) throws Exception{

    }

}
