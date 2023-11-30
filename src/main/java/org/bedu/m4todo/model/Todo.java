package org.bedu.m4todo.model;

public class Todo {
    
    private long id;
    private String title;
    private String descriptio;
    private boolean completed;
    
    public Todo(long id, String title, String descriptio, boolean completed) {
        this.id = id;
        this.title = title;
        this.descriptio = descriptio;
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

    public String getDescriptio() {
        return descriptio;
    }

    public void setDescriptio(String descriptio) {
        this.descriptio = descriptio;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    


}
