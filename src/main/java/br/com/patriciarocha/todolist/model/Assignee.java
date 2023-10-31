package br.com.patriciarocha.todolist.model;


public class Assignee {

    private Integer id;
    private String name;

    public Assignee() {
    }

    public Assignee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
