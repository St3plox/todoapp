package me.tusur.todoapp.web;

import me.tusur.todoapp.entity.Task;
import me.tusur.todoapp.service.ToDoService;
import me.tusur.todoapp.service.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("tasks",toDoService.getTasks());
        return "index";
    }

    @GetMapping("/form")
    public String getForm(Model model){
        model.addAttribute("task", new Task());
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(Task task){
        toDoService.saveTask(task);
        return "redirect:/";
    }
}
