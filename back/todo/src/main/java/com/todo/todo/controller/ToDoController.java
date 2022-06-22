package com.todo.todo.controller;

import com.todo.todo.entity.todo.api.ToDoAPI;
import com.todo.todo.entity.todo.model.ToDoModel;
import com.todo.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController implements ToDoAPI {

    @Autowired
    ToDoService toDoService;

    @Override
    public List<ToDoModel> getAllTodos() {
        return toDoService.getAllTodos();
    }

    @Override
    public ToDoModel getToDoModelById(Long todoId) {
        return toDoService.getToDoModelById(todoId);
    }

    @Override
    public ToDoModel createToDoModel(ToDoModel todo) {
        return toDoService.createToDoModel(todo);
    }

    @Override
    public ToDoModel updateToDoModel(Long todoId, ToDoModel todo) {
        return null;
    }

    @Override
    public String deleteToDoModel(Long todoId) {
        return null;
    }

}
