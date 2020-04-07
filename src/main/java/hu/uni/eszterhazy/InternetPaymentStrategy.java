package hu.uni.eszterhazy;

import java.util.UUID;

public class InternetPaymentStrategy implements PaymentStrategy {

    Card card;
    UUID sessionID;

    public InternetPaymentStrategy(Card card, UUID sessionID) {
        this.card = card;
        this.sessionID = sessionID;
    }

    @Override
    public String pay(double amount) {
        return "Paid "+amount+"with card over internet to "+sessionID;
    }
}
