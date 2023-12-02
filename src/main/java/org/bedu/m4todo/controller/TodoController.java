package org.bedu.m4todo.controller;

//import java.util.LinkedList;
import java.util.List;

import org.bedu.m4todo.dto.CreateTodoDTO;
import org.bedu.m4todo.dto.TodoDTO;
//import org.bedu.m4todo.model.Todo;
import org.bedu.m4todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

//import jakarta.validation.Valid;

@RestController
public class TodoController {

    @Autowired  //Para que la inversión de control de spring me de la instancia de este servicio:
    private TodoService todoService;
    
    // Lo paso a TodoService.java --> private List<Todo> todos;
    // Lo paso a TodoService.java --> private long currentId = 1l;

    /*public TodoController() {
        todos = new LinkedList<>();
        todos.add(new Todo(1, "Tarea de prueba", "Esto es una tarea", false));
    } */ //Tambien se PASA AL TodoService

    // Obtener todas las tareas
    // URL para acceder a este método: http://localhost:8080/obtenerTodos
    // Lo que hace Spring es tomar la lista java y convertirla a un JSON para presentar en navegador
    @RequestMapping("/obtenerTodos")
    public List<TodoDTO> getAll() {
        return todoService.getAll();
    }
        
        /* List<TodoDTO> data = new LinkedList<>();
        for ( Todo model : todos) {
            TodoDTO dto = new TodoDTO();
            dto.setId(model.getId());
            dto.setTitle(model.getTitle());
            dto.setDescription(model.getDescription());
            dto.setCompleted(model.isCompleted());
        }

        return data;
    } */ // HASTA AQUÍ FUNCIONA DE LA MISMA FORMA QUE ANTES PERO AHORA CON MEJORÍA EN LA ORGANIZACIÓN DEL CÓDIGO, PERO LE FALTA LA CAPA DE SERVICIO (O Negocio, Lógica ) QUE SIRVE PARA EJECUTAR REGLAS DE NEGOCIOS/VALIDACIONES/ALGORITMOS, a esta capa no le importa como llegan los datos, sabe como manipularla y luego regresar los datos

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
     * 3. Utilizando el REQUEST BODY <-- para este ejemplo, la información del título y descripción del Todo, entrará por este punto ...
     * 
     * 4. Utilizando los ENCABEZADOS header, es básicamente información adicional que se le dá a la perición, 
     * 
     */
    @RequestMapping("/crearTodo")
    // Aquí para el PARÁMETRO DE ENTRADA vamos a sustituir el tipo Todo por el CreateTodoDTO para title y description: public Todo create(@Valid @RequestBody Todo data) y para el PARÁMETRO DE SALIDA por el TodoDTO
    public TodoDTO create(@Valid @RequestBody CreateTodoDTO data) { 
        return todoService.create(data);
    }
        /* 
        // Por aquí se recibi la información del Todo, title, description, ... que se tiene en el modelo
        // Por lo gheneral un API regresa el elemento ecien creado, pero en ocasiones es elemento puede contener indormación adicional que no se 
        // envió, ej. el id
        // Para este caso el id lo generaos nosotros, declaramos variable currentId y de forma manual la incrementamos cada que se crea una tarea
         data.setCompleted(false);
        data.setId(++currentId);

        todos.add(data);

        return data;  //Borramos lo anterior e implementamos nuevo con los DTOs

        Todo model = new Todo(++currentId, data.getTitle(), data.getDescription(), false); // Convertimos de DTO a Model. Model es cómo almaceno los datos y DTO es cómo los recibo en el controlador y cómo los regreso
        todos.add(model);

        TodoDTO dto = new TodoDTO();
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setDescription(model.getDescription());
        dto.setCompleted(model.isCompleted());

        return dto;
    } */

    //Marcar como completada una tarea


    // Obtener una sola tarea (por identificado)

}
