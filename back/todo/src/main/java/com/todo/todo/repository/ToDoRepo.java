package com.todo.todo.repository;

import com.todo.todo.entity.todo.api.ToDoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepo extends JpaRepository <ToDoModel, Long> {
}
