package Assignament1;
import java.util.*;

import Assignament1.Models.Task;


public class Main {
    private static List<Controller> db = new ArrayList<Controller>();
    public static void main(String[] args) {
        Controller task1 = new Controller(new Task("TASK1",(int) Math.floor(Math.random()*10), false) , new Views());
        Controller task2 = new Controller(new Task("TASK2",(int) Math.floor(Math.random()*10), false) , new Views());
        db.add(task1);
        db.add(task2);
        for(Controller c: db){
            c.printTask();
        }
        completeTask("TASK2");
    }
    private static void completeTask(String name){
        for(Controller c: db){
            if(c.getName().equals(name)){
                c.setIsCompleted(true);
                System.out.println("UPDATED");
                c.printTask();
            }
        }
    }
}
