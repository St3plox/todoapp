package me.tusur.todoapp.service;

import me.tusur.todoapp.constants.Constants;
import me.tusur.todoapp.pojo.Task;
import me.tusur.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository repository;

    public Task getTask(int index) {
        return repository.getTask(index);
    }

    public void addTask(Task task) {
        repository.addTask(task);
    }

    public List<Task> getTasks() {
        return repository.getTasks();
    }

    public void deleteTask(int index) {
        repository.deleteTask(index);
    }
    public void updateTask(int index, Task task){
        repository.updateTask(index, task);
    }

    public Task getTaskFromId(String id) {
        int index = getIndexFromId(id);
        return index == Constants.NOT_FOUND ? new Task() : getTask(index);
    }

    public int getIndexFromId(String id) {
        for (int i = 0; i < getTasks().size(); i++) {
            if (getTask(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }

    public void handleSubmit(Task task) {
        int index = getIndexFromId(task.getId());
        if (index == Constants.NOT_FOUND) addTask(task);
        else {
            updateTask(index, task);
        }
    }
}
