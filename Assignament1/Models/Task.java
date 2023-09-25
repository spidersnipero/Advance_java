package Assignament1.Models;

public class Task {
    private String Name;
    private Integer Priority;
    private Boolean IsCompleted;

    public Task(String name,Integer priority,Boolean iscompleted){
        this.Name = name;
        this.Priority = priority;
        this.IsCompleted = iscompleted;
    }
    // getters
    public String getName(){
        return this.Name;
    }
    public Integer getPriority(){
        return this.Priority;
    }
    public Boolean getIsCompleted(){
        return this.IsCompleted;
    }
    // setters
    public void setName(String name){
        this.Name = name;
    }
    public void setPriority(Integer priority){
        this.Priority = priority;
    }
    public void setIsCompleted(Boolean iscompleted){
        this.IsCompleted = iscompleted;
    }

}
