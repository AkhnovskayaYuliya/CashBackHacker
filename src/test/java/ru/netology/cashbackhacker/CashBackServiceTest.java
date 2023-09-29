package ru.netology.cashbackhacker;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService service = new CashBackService();

   @Test
   public void ifAmountIs900() {
       int expected = 100;
       int actual = service.remain(900);
       assertEquals(expected, actual);
   }

    @Test
    public void ifAmountIs1000() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void ifAmountIs0() {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }


   }