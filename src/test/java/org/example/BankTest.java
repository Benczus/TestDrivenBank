package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class BankTest
{
    String name = "Dagobert INC";
    UUID id = UUID.randomUUID();
    String location = "DUckburg";
    String owner= "Dagobert"
    Bank bank= new Bank(name, id, location, owner);

    @Before
    public void initMethod(){

        bank.addUserAccount("Kis Jóska", UUID.randomUUID(), false);
        bank.addUserAccount("Gipsz Jakab", UUID.randomUUID(), false);
        bank.addUserAccount("Nagy Péter", UUID.randomUUID(), true);

    }


    @Test
    public void constructorBankTest(){
        bank.setLocation();
        bank.setName();
        bank.setOwner();
    }

    @Test
    public void depositBankTest(){

    }

    @Test
    public void withdrawBankTest(){

    }

    @Test
    public void creditBankTest(){

    }

    @Test
    public void creditOverdraftBankTest(){

    }

    @Test
    public void avgDepositBankTest(){

    }

    @Test
    public void sumDepositBankTest(){

    }

    @Test
    public void testUserAccountMethod(){

    }


}
