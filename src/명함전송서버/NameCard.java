package 명함전송서버;


import java.io.Serializable;

public class NameCard implements Serializable {
    String name;
    String phNumber;
    String email;
    String address;

    public NameCard(String name, String phNumber, String email, String address) {
        this.name = name;
        this.phNumber = phNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
