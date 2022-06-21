package com.todo.todo.entity.todo.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public interface ToDoAPI {

    @GetMapping("/todo")
    public List<ToDoModel> GetAllTodos();

    @GetMapping("/todo/{id}")
    public ToDoModel getToDoModelById(@PathVariable("id") Integer id);

}
