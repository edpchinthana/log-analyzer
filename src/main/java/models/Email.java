package models;

public class Email {
    int id;
    String name;
    String email_address;

    public Email(String name, String email_address) {
        this.name = name;
        this.email_address = email_address;
    }

    public Email(int id, String name, String email_address) {
        this.id = id;
        this.name = name;
        this.email_address = email_address;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_address() {
        return this.email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
}