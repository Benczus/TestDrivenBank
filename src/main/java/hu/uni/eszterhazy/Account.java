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
    List<Card> cards;

    public Account(String ownerName) {
        this.ownerName = ownerName;
        this.id= UUID.randomUUID();
        this.balance=0;
        observerList=new ArrayList<>();
        this.state="Created";
        cards=new ArrayList<>();
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

    public void addCard(Card card){
        this.cards.add(card);
    }

    public void removeCard(Card card){
        this.cards.add(card);
    }


    public List<Card> getCards() {
        return cards;
    }

    public void pay(double amount, PaymentStrategy strategy) {
        System.out.println(strategy.pay(amount));
    }
}
