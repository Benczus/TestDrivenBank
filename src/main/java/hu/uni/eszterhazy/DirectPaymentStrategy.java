package hu.uni.eszterhazy;

import java.util.UUID;

public class DirectPaymentStrategy implements PaymentStrategy {

    UUID sessionID;
    String PIN;

    public DirectPaymentStrategy( String PIN, UUID sessionID) {
        this.sessionID = sessionID;
        this.PIN = PIN;
    }

    @Override
    public String pay(double amount) {
        return "Paid "+amount+"with card directly to "+sessionID;
    }
}
