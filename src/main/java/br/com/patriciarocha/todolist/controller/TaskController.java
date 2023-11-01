package br.com.patriciarocha.todolist.controller;

import br.com.patriciarocha.todolist.database.Database;
import br.com.patriciarocha.todolist.model.Task;
import br.com.patriciarocha.todolist.model.transport.TaskDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Define que a classe será um controlador que intercepta requisições
@RequestMapping("/task") // Define o path para onde as requisições serão mapeadas
public class TaskController {
    @PostMapping
    public ResponseEntity<TaskDTO> create(@RequestBody TaskDTO taskDTO) {
        //ResponseEntity - classe do spring que possui métodos para criar uma resposta personalizada para
        // retornar ao usuário
        Task taskPost = new Task(taskDTO);
        Database.add(taskPost);
        return ResponseEntity.status(HttpStatus.CREATED).body(taskDTO);
    }
}
