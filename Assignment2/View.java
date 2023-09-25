package Assignment2;
import Assignment2.models.Address_book;

public class View {
    public void printAddress_book(Address_book address_book){
        System.out.println("Name: " + address_book.getName());
        System.out.println("Phone: " + address_book.getPhone());
        System.out.println("Email: " + address_book.getEmail());
        System.out.println();
    }
}
