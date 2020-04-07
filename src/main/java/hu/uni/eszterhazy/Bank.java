package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {

    private String bankName;
    private UUID bankId;
    private String location;
    private String ownerName;
    private int bankCode;
    private List<User> userList = new ArrayList<>();
    private static Bank bank= new Bank("Dagobert INC.", UUID.randomUUID(), "Duckbert", "Dagobert Bácsi");




    public String getBankName() {
        return bankName;
    }

    public UUID getBankId() {
        return bankId;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getBankCode() {
        return bankCode;
    }

    public List<User> getUserList() {
        return userList;
    }

    static Bank getInstance(){
        return bank;
    }

    private Bank(String bankName, UUID bankId, String location, String ownerName) {
        this.bankName = bankName;
        this.bankId = bankId;
        this.location = location;
        this.ownerName = ownerName;
        this.bankCode = generateBankCode();
        this.userList = userList;
    }


    public int generateBankCode(){
        return (int) (Math.random()*1000);
    }


    public void addUser(String userName, UUID userID, String mobileNum, String address ){
        userList.add(new User(userName, userID, mobileNum, address));
    }

}
