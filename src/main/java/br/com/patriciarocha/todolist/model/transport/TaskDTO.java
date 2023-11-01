package br.com.patriciarocha.todolist.model.transport;

import br.com.patriciarocha.todolist.model.Assignee;
import br.com.patriciarocha.todolist.model.Task;
import br.com.patriciarocha.todolist.model.enums.PriorityEnum;
import br.com.patriciarocha.todolist.model.enums.StatusEnum;

import java.time.LocalDate;

//essa classe permite criar um Task a partir de TaskDTO através do construtor criado em Task
// e também consegue criar um TaskDTO a partir de Task
public record TaskDTO(Integer id, String description, LocalDate startDate, LocalDate endDate,
                      StatusEnum status, PriorityEnum priority, Assignee assignee ) {
    //construtor canônico
    public  TaskDTO(Task task) {
        this(task.getId(), task.getDescription(), task.getStartDate(), task.getEndDate(),
                task.getStatus(), task.getPriority(), task.getAssignee());
    }
}
