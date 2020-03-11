package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HourlyTest {
    Hourly hourly;

    @Before
    public void setUp() throws Exception {
        hourly = new Hourly("George Jones", 75.00, 2.5);
    }

    @Test
    public void getRate() {
        Assert.assertEquals(78,hourly.getRate());
    }

    @Test
    public void setRate() {
    }

    @Test
    public void getHours() {
        Assert.assertEquals(8,hourly.getHours());
    }

    @Test
    public void setHours() {
    }

    @Test
    public void pay() {
        Assert.assertEquals(45,hourly.pay());
    }

    @Test
    public void testToString() {
        String result = "Rate is 75.0 and hours are 2.5";
        Assert.assertEquals(result,hourly.toString());
    }
}