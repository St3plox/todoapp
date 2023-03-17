package me.tusur.todoapp.repository;

import me.tusur.todoapp.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
