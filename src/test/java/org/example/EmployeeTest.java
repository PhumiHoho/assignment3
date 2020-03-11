package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {


        Employee hourly;
        Employee salaried;

    @Before
    public void setUp() throws Exception {
        hourly = new Hourly("George Jones", 75.00, 2.5);
        salaried = new Salaried("Dolly Parton", 125.00);
    }


    @Test
    public void getName() {

        Assert.assertEquals("George Jones", hourly.getName());
    }

    @Test
    public void setName() {
    }

    @Test
    public void pay() {
        int result= 100;
        Assert.assertEquals(100,salaried.pay());
    }


}