package hu.uni.eszterhazy;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

public class AccountTest {

    Account account= new Account("Kis Jóska");
    @Before
    public void setUp() throws Exception {

        account.attach(new PhoneMessager(account, "12312551231"));
        account.attach(new EmailMessager(account, "kisjoska86@fakemail.com"));
        account.attach(new RESTMessager(account, UUID.randomUUID().toString()));



    }

    @Test
    public void observerTest() {
        account.withdraw(123.0);
    }

    @Test
    public void strategyBehaviourTest() {
        account.pay(12.0, new DirectPaymentStrategy("1234", UUID.randomUUID()));
        account.pay(12.0, new InternetPaymentStrategy(account.getCards().get(0), UUID.randomUUID()));
        account.pay(12.0, new PaypalPaymentStrategy("kisjoska86@fakemail.com", "kisjoskavagyok123",UUID.randomUUID()));
    }

    @Test
    public void avgDepositBankTest(){

    }

    @Test
    public void sumDepositBankTest(){

    }

    @Test
    public void checkAccountType(){

    }

    @Test
    public void checkOverdraft(){

    }

    @Test
    public void depositTest(){

    }

    @Test
    public void withdrawTest(){

    }

    @Test
    public void checkBalance(){

    }

    @Test
    public void modifyBalance(){

    }
}
