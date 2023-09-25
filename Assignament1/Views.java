package Assignament1;
import Assignament1.Models.Task;

public class Views {
    public void printTask(Task task){
        System.out.println("Name: " + task.getName());
        System.out.println("Priority: " + task.getPriority());
        System.out.println("Is Completed: " + task.getIsCompleted());
        System.out.println();
    }
}
