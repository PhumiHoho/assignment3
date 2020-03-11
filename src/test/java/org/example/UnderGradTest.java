package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGradTest  {
UnderGrad underGrad;
    @Before
    public void setUp() throws Exception {
        underGrad =new UnderGrad("haf","bdfuy",788);
    }

    @Test
    public void testInterest() {
        Assert.assertEquals(466,underGrad.interest());

    }


}