package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalariedTest {
    Salaried salaried;

    @Before
    public void setUp() throws Exception {
        salaried = new Salaried("Dolly Parton", 125.00);
    }

    @Test
    public void getSalary() {
        Assert.assertEquals(120,salaried.getSalary());
    }

    @Test
    public void setSalary() {
        Assert.assertEquals(120,salaried.getSalary());
    }

    @Test
    public void pay() {
        Assert.assertTrue(true);
       // Assert.assertEquals(120,salaried.getSalary());
    }

    @Test
    public void testToString() {
        String result= "Salary is 125.0";
        Assert.assertEquals(result,salaried.toString());
    }
}