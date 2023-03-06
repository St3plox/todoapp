package me.tusur.todoapp.service;

import me.tusur.todoapp.entity.Task;
import me.tusur.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServiceImpl  implements ToDoService{

    @Autowired
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

    public Task getTaskFromId(Long id){
        if(id == null){
            return new Task();
        }
        if(toDoRepository.existsById(id)) return toDoRepository.findById(id).get();
        return new Task();
    }


//    public void handleSubmit(Task task) {
//        toDoRepository.existsById(task.getId())) saveTask(task);
//    }
}
