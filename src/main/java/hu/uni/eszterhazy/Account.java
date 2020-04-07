package hu.uni.eszterhazy;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account implements Subject {

    public String getState() {
        return state;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public UUID getId() {
        return id;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    private String state;
    private double balance;
    private String ownerName;
    private UUID id;
    List<Observer> observerList;

    public Account(String ownerName) {
        this.ownerName = ownerName;
        this.id= UUID.randomUUID();
        this.balance=0;
        observerList=new ArrayList<>();
        this.state="Created";

    }

    public void withdraw(Double amount){
        this.balance=balance-amount;
        this.state="Withdrawn";
        notifyObservers();
    }


    @Override
    public void attach(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void detach(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update();
        }
    }
}
