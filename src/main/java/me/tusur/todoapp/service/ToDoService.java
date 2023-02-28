package me.tusur.todoapp.service;

import me.tusur.todoapp.pojo.Task;
import me.tusur.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository repository;

    public Task getTask(int index) {
        return repository.getTask(index);
    }

    public void addTask(Task task){
        repository.addTask(task);
    }

    public List<Task> getTasks(){
        return repository.getTasks();
    }

    public void deleteTask(int index){
        repository.deleteTask(index);
    }
}
