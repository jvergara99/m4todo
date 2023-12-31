package org.bedu.m4todo.model;


// BORRAR import jakarta.validation.constraints.NotNull;
// BORRAR import jakarta.validation.constraints.Size;

public class Todo {
    
    private long id;

    // BORRAR @NotNull
    // BORRAR @Size(max = 100)
    private String title;

    // BORRAR @NotNull
    // BORRAR @Size(max = 2500)
    private String description;
    private boolean completed;
    
    public Todo(long id, String title, String description, boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptio(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    


}
