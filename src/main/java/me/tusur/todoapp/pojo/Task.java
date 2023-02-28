package me.tusur.todoapp.pojo;

import java.util.UUID;

public class Task {
    private final String id;

    private String name;

    public Task() {
        this.id = UUID.randomUUID().toString();
    }

    public Task(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
