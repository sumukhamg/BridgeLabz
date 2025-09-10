package org.example.task_management_system;

public class Task {
    private int taskId;
    private String description;
    private String dueDate;

    private boolean status = false;

    public Task(int taskId, String description, String dueDate) {
        this.taskId = taskId;
        this.description = description;
        this.dueDate = dueDate;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
