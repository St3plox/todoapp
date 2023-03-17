package me.tusur.todoapp.service;

import lombok.AllArgsConstructor;
import me.tusur.todoapp.entity.Task;
import me.tusur.todoapp.exception.EntityNotFoundException;
import me.tusur.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

    TaskRepository taskRepository;

    @Override
    public Task getTask(Long id) {
        Optional<Task> task = taskRepository.findById(id);
      return unwrapTask(task, id);
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        taskRepository.delete(unwrapTask(task, id));
    }

    @Override
    public List<Task> getTasks() {
        return (List<Task>) taskRepository.findAll();
    }

    private static Task unwrapTask(Optional<Task> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new EntityNotFoundException(id, Task.class);
    }

}
