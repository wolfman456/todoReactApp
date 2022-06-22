package com.todo.todo.entity.todo.api;

import com.todo.todo.entity.todo.model.ToDoModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin("http://localhost:3000/")
public interface ToDoAPI {

    @GetMapping("/todo")
    public List<ToDoModel> getAllTodos();

    @GetMapping("/todo/{todoid}")
    public ToDoModel getToDoModelById(@PathVariable(value = "todoid") Long todoId);

    @PostMapping("/todo")
    public ToDoModel createToDoModel(@RequestBody ToDoModel todo);

    @PutMapping("/todo/{todoid}")
    public ToDoModel updateToDoModel(@PathVariable(value = "todoid") Long todoId, @RequestBody ToDoModel todo);

    @DeleteMapping("/todo/{todoid}")
    public String deleteToDoModel(@PathVariable(value = "todoid") Long todoId);

}
