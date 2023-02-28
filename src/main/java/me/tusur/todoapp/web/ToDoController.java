package me.tusur.todoapp.web;

import me.tusur.todoapp.pojo.Task;
import me.tusur.todoapp.service.ToDoService;
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
    public String getIndex() {
        return "index";
    }

    @GetMapping("/form")
    public String getForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("task",toDoService.getTaskFromId(id));
        return "form";
    }

    @PostMapping("/submitForm")
    public String submitForm(Task task){
        toDoService.handleSubmit(task);
        return "redirect:/";
    }
}
