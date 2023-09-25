package Assignment2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Add new contact");
            System.out.println("2. Show all contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Delete contact");
            System.out.println("5.Update contact ");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Controller.addContact();
                    break;
                case 2:
                    Controller.showAllContacts();
                    break;
                case 3:
                    Controller.searchContact();
                    break;
                case 4:
                    Controller.deleteContact();
                    break;
                case 5:
                    Controller.updateContact();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            

            }
        }
        sc.close();
    }
    
}
