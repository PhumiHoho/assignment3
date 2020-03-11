package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallBusinessTest {
SmallBusiness business;
    @Before
    public void setUp() throws Exception {

        business =new SmallBusiness();

    }

    @Test
    public void testToString() {
        Assert.assertNotNull(business.toString());
    }

    @Test
    public void interest() {
        double amt = 218;
        Assert.assertEquals(amt,business.interest());
    }
}