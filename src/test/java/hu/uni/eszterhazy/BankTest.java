package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class BankTest
{
    Bank bank=Bank.getInstance();

    @Before
    public void initMethod(){
        bank.addUser("Kis Jóska", UUID.randomUUID(), "06302659128", "Kiss Utca");
        bank.addUser("Nagy Sándor", UUID.randomUUID(), "06302659128", "Kiss Utca");
        bank.addUser("Gipsz Jakab", UUID.randomUUID(), "06302659128", "Kiss Utca");
    }

    @Test
    public void singletonBehaviourTest() {

        Assert.assertEquals(bank, Bank.getInstance());

    }

    @Test
    public void avgDepositBankTest(){



    }

    @Test
    public void sumDepositBankTest(){

    }



}
