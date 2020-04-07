package hu.uni.eszterhazy;

import java.util.UUID;

public class PaypalPaymentStrategy implements PaymentStrategy {

    String email;
    String password;
    UUID sessionID;

    public PaypalPaymentStrategy(String email, String password, UUID sessionID) {
        this.email = email;
        this.password = password;
        this.sessionID = sessionID;
    }

    @Override
    public String pay(double amount) {
        return "Paid "+amount+"with Paypal to "+sessionID;
    }
}
