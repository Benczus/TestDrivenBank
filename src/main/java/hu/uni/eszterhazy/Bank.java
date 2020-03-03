package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {

    String name;
    UUID id;
    String location;
    String owner;
    List<User> users =new ArrayList<>();

    public Bank(String name, UUID id, String location, String owner) {
        this.name = name;
        this.id = id;
        this.location = location;
        this.owner = owner;
    }

    public void addUser(String userName, UUID userID, String mobileNum, String address ){
        //TODO
    }

}
