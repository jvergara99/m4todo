package org.bedu.m4todo.controller;

import java.util.LinkedList;
import java.util.List;

import org.bedu.m4todo.model.Todo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    
    private List<Todo> todos;

    public TodoController() {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Tarea de prueba", "Esto es una tarea", false));
    }

    // Obtener todas las tareas
    // URL para acceder a este método: http://localhost:8080/obtenerTodos
    // Lo que hace Spring es tomar la lista java y convertirla a un JSON para presentar en navegador
    @RequestMapping("/obtenerTodos")
    public List<Todo> getAll() {
        return todos;
    }

    // Crear una nueva tarea
    /*
     *  Un API tiene 4 maneras de recibir parámetros/datos
     *  1. Utilizando el QUERY STRING, por ej. https://amazon.com.mx/productos?key1=value&key2=value2&... <-- después del signo 
     * de interrogación es lo que se conoce como el QUERY STRING, por lo general se UTILIZA MAS PARA EL FILTRADO DE DATOS
     * por ej. quiero todas las tareas completadas o con cierto título, dichos datos del QS son opcionales
     * 
     *  2. Utilizando un PATH VARIABLE, es decir que un pedazo de la URL se convierta en una variable y se UTILIZA MAS para dejar 
     * identificadores o valores cortos. eJ. https://amazon.com.mx/carrito/1234-5678
     * 
     * 3. Utilizando el REQUEST BODY
     * 
     * 4. Utilizando los ENCABEZADOS header
     * 
     */
    @RequestMapping("/crearTodo")
    public ? create() {

    }

    //Marcar como completada una tarea


    // Obtener una sola tarea (por identificado)

}
