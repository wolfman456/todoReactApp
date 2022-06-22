package com.todo.todo.repository;

import com.todo.todo.entity.todo.model.ToDoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends JpaRepository <ToDoModel, Long> {
}
