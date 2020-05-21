package com.example.demo;


import javax.validation.constraints.NotEmpty;


public class ToDoList {
    @NotEmpty(message = "is required")
    private String name;
    @NotEmpty(message = "is required")
    private String description;
    @NotEmpty(message = "is required")
    private String priority;
    @NotEmpty(message = "is required")
    private String date;
    private boolean is_completed;


    public ToDoList(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isIs_completed() {
        return is_completed;
    }

    public void setIs_completed(boolean is_completed) {
        this.is_completed = is_completed;
    }
}
