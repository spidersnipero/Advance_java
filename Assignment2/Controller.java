package Assignment2;
import Assignment2.models.Address_book;
import java.util.*;

public class Controller {
    static List<Address_book> db = new ArrayList<Address_book>();
    
    public static void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        Address_book address_book = new Address_book(name, phone, email);
        db.add(address_book);
        sc.close();
    }
    public static void showAllContacts(){
        for(Address_book address_book: db){
            System.out.println("Name: " + address_book.getName());
            System.out.println("Phone: " + address_book.getPhone());
            System.out.println("Email: " + address_book.getEmail());
            System.out.println();
        }
    }
    public static void searchContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        for(Address_book address_book: db){
            if(address_book.getName().equals(name)){
                System.out.println("Name: " + address_book.getName());
                System.out.println("Phone: " + address_book.getPhone());
                System.out.println("Email: " + address_book.getEmail());
                System.out.println();
                sc.close();
                return;
            }
        }
        System.out.println("Contact not found");
        sc.close();
    }
    public static void deleteContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        for(Address_book address_book: db){
            if(address_book.getName().equals(name)){
                db.remove(address_book);
                System.out.println("Contact deleted");
                sc.close();
                return;
            }
        }
        System.out.println("Contact not found");
        sc.close();
    }
    public static void updateContact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        for(Address_book address_book: db){
            if(address_book.getName().equals(name)){
                System.out.println("1. Update phone");
                System.out.println("2. Update email");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                if(choice==1){
                    System.out.print("Enter new phone number: ");
                    sc.nextLine();
                    String phone = sc.nextLine();
                    address_book.setPhone(phone);
                }
                else if(choice==2){
                    System.out.print("Enter new email: ");
                    sc.nextLine();
                    String email = sc.nextLine();
                    address_book.setEmail(email);
                }
                else{
                    System.out.println("Invalid choice");
                }
                break;
            }
        }
        System.out.println("Contact not found");
        sc.close();
    }



}
