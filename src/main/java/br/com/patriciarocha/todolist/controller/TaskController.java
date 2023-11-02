package br.com.patriciarocha.todolist.controller;

import br.com.patriciarocha.todolist.database.Database;
import br.com.patriciarocha.todolist.model.Task;
import br.com.patriciarocha.todolist.model.transport.TaskDTO;
import br.com.patriciarocha.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Define que a classe será um controlador que intercepta requisições
@RequestMapping("/task") // Define o path para onde as requisições serão mapeadas
public class TaskController {

    private final TaskService taskService;
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO) {
        //ResponseEntity - classe do spring que possui métodos para criar uma resposta personalizada para
        // retornar ao usuário
        TaskDTO response = this.taskService.create(taskDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<TaskDTO>> list(){

        List<TaskDTO> response = this.taskService.listAll();

        if(response.isEmpty())
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok(response);
    }
}
