package com.todo.todo.service.ServiceImple;

import com.todo.todo.entity.todo.model.ToDoModel;
import com.todo.todo.exception.InformationExistException;
import com.todo.todo.exception.InformationNotFoundException;
import com.todo.todo.repository.ToDoRepo;
import com.todo.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    ToDoRepo toDoRepo;

    @Override
    public List<ToDoModel> getAllTodos() {
        return toDoRepo.findAll();
    }

    @Override
    public ToDoModel getToDoModelById(Long todoId) {
        return toDoRepo.findById(todoId).orElseThrow(()->
                new InformationNotFoundException("no budget with ID " + todoId + " found"));
    }

    @Override
    public ToDoModel createToDoModel(ToDoModel todo) {
        if (todo == null) {
            throw new InformationExistException("No record created");
        }else {
             ToDoModel todoModel = ToDoModel.builder()
                    .name(todo.getName())
                    .description(todo.getDescription())
                    .completed(todo.getCompleted())
                    .build();
           return toDoRepo.save(todoModel);
        }
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
