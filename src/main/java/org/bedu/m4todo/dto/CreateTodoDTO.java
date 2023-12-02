package org.bedu.m4todo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CreateTodoDTO {
    
    @NotBlank //Esta es una mejor validación, ya que nos valida que no sea nulo o que no esté vacia
    @Size( max = 100)
    private String title;

    @NotBlank //Esta es una mejor validación, ya que nos valida que no sea nulo o que no esté vacia
    @Size( max = 2500)
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
