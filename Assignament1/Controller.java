package Assignament1;
import Assignament1.Models.Task;



public class Controller {
    private Task task;
    private Views  view;

    public Controller(Task t, Views v){
        this.task = t;
        this.view = v;
    }
    // model setters
    public void setName(String name){
        this.task.setName(name);
    }
    public void setPriority(Integer priority){
        this.task.setPriority(priority);
    }
    public void setIsCompleted(Boolean iscompleted){
        this.task.setIsCompleted(iscompleted);
    }

    

    // model getters
    public String getName(){
        return this.task.getName();
    }
    public Integer getPriority(){
        return this.task.getPriority();
    }
    public Boolean getIsCompleted(){
        return this.task.getIsCompleted();
    }

    // view methods
    public void printTask(){
        this.view.printTask(this.task);
    }

}
