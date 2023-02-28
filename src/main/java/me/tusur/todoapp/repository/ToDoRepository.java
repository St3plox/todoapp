package me.tusur.todoapp.repository;

import me.tusur.todoapp.pojo.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepository {
    private List<Task> tasks = new ArrayList<>();

    public Task getTask(int index) {
        return tasks.get(index);
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public List<Task> getTasks(){
        return new ArrayList<>(tasks);
    }

    public void deleteTask(int index){
        tasks.remove(index);
    }
}
