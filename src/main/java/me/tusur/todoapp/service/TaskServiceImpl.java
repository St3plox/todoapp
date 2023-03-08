package me.tusur.todoapp.service;

import lombok.AllArgsConstructor;
import me.tusur.todoapp.service.entity.Task;
import me.tusur.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    ToDoRepository toDoRepository;

    @Override
    public Task getTask(Long id) {
      return toDoRepository.findById(id).get();
    }

    @Override
    public Task saveTask(Task task) {
        return toDoRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        toDoRepository.deleteById(id);
    }

    @Override
    public List<Task> getTasks() {
        return (List<Task>) toDoRepository.findAll();
    }

}
