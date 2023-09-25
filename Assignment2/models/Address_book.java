package Assignment2.models;

public class Address_book {
    private String name;

    private String phone;
    private String email;

    public Address_book(String name, String phone, String email){
        this.name = name;

        this.phone = phone;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getPhone(){
        return this.phone;
    }

    public String getEmail(){
        return this.email;
    }


    public void setName(String name){
        this.name = name;
    }


    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
