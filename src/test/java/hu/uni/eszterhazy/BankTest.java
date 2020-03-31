package hu.uni.eszterhazy;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class BankTest
{
    String name = "Dagobert INC";
    UUID id = UUID.randomUUID();
    String location = "DUckburg";
    String owner= "Dagobert";
    Bank bank=Bank.getInstance();

    @Before
    public void initMethod(){

        bank.addUser("Kis Jóska", UUID.randomUUID(), "06302659128", "Kiss Utca");
        bank.addUser("Nagy Sándor", UUID.randomUUID(), "06302659128", "Kiss Utca");
        bank.addUser("Gipsz Jakab", UUID.randomUUID(), "06302659128", "Kiss Utca");
    }


    @Test
    public void avgDepositBankTest(){



    }

    @Test
    public void sumDepositBankTest(){

    }



}
