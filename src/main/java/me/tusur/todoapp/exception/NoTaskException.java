package me.tusur.todoapp.exception;

public class NoTaskException extends RuntimeException {
    public NoTaskException(Long taskId) {
        super("The task with" + taskId + "does not exist");
    }
}
