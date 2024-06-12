import java.io.Serializable;

public class Contact implements Serializable {
    String name;
    String email;
    String phoneNumber;

    public Contact() {

        this.name = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public Contact(String name, String email, String phoneNumber) {
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return this.name+" "+this.email+" "+this.phoneNumber;
    }
}
