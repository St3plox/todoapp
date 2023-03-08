package me.tusur.todoapp.service;

import me.tusur.todoapp.service.entity.Task;

import java.util.List;

public interface TaskService {
    Task getTask(Long id);

    Task saveTask(Task task);

    void deleteTask(Long id);

    List<Task> getTasks();

}
