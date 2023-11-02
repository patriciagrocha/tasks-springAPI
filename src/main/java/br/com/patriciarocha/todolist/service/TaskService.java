package br.com.patriciarocha.todolist.service;

import br.com.patriciarocha.todolist.database.Database;
import br.com.patriciarocha.todolist.model.Task;
import br.com.patriciarocha.todolist.model.transport.TaskDTO;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {

    public TaskDTO create(TaskDTO taskDTO){
        Task task = new Task(taskDTO);
        Database.add(task);
        return  taskDTO;
    }

    public List<TaskDTO> listAll(){

        List<Task> tasks = Database.listAll();
        return tasks.stream().map(TaskDTO::new).toList();
        //tasks.stream().map(task -> new TaskDTO(task)).toList();

    }


}
