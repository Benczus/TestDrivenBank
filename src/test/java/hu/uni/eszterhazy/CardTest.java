package hu.uni.eszterhazy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;


public class CardTest {

    Card card;

    @Before
    public void initClasses(){
        card= new Card.CardBuilder("123", true).setCardNum("12315443234").setCvc(423).setExpDate(LocalDate.of(2011, 11, 21)).build();

    }


    @Test
    public void checkCardBuilder(){
        System.out.println(card);
        Assert.assertNotNull(card);
    }

    @Test
    public void checkAvailability(){
        Assert.assertTrue(card.isAvailable());
    }

    @Test
    public void checkExperidationDate(){
        Assert.assertEquals(card.printExpDate(), "2011-11-21");
    }



    @Test
    public void modifyAvailability(){
        //TODO
    }

    @Test
    public void checkCannotWithdrawFromDeclined(){
        //TODO
    }



}