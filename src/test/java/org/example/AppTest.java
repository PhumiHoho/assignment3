package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Employee hourly = new Hourly("George Jones", 75.00, 2.5);
    Employee salaried = new Salaried("Dolly Parton", 125.00);

    @Test
    public void getName()
    {
        assertEquals("George Jones", hourly.getName());
        assertEquals("Dolly Parton", salaried.getName());
    }
}
