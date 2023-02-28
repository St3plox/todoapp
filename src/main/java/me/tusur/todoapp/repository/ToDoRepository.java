package me.tusur.todoapp.repository;

import me.tusur.todoapp.pojo.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepository {
    private List<Task> tasks = new ArrayList<>();

    private Task getTask(int index) {
        return tasks.get(index);
    }

    private void addTask(Task task){
        tasks.add(task);
    }

    private List<Task> getTasks(){
        return new ArrayList<>(tasks);
    }

    private void deleteTask(int index){
        tasks.remove(index);
    }
}
