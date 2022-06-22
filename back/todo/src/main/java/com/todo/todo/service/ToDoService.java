package com.todo.todo.service;

import com.todo.todo.entity.todo.model.ToDoModel;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public interface ToDoService {


    public List<ToDoModel> getAllTodos();


    public ToDoModel getToDoModelById(Long todoId);


    public ToDoModel createToDoModel(ToDoModel todo);


    public ToDoModel updateToDoModel( Long todoId, ToDoModel todo);


    public String deleteToDoModel(Long todoId);
}
