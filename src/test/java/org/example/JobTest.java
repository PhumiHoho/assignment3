package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class JobTest {
    Job job;

    @Before
    public void setUp() throws Exception {
        job=new Job();
    }

    @Test
    public void getRole() {
        String result = "Developer";
        job.setRole(result);
        Assert.assertEquals(result,job.getRole());
    }

    @Test
    public void setRole() {
        String result = "Programmer";
        job.setRole(result);
        Assert.assertEquals(result,job.getRole());
    }

    @Test
    public void getSalary() {
        long result =1000;
        job.setSalary(result);
        Assert.assertEquals(result,job.getSalary());
    }

    @Test
    public void setSalary() {
        long result =1000;
        job.setSalary(result);
        Assert.assertEquals(result,job.getSalary());
    }

    @Test
    public void getId() {
        int result = 18151;
        job.setId(result);
        Assert.assertEquals(result,job.getId());
    }

    @Test
    public void setId() {
        int result = 18191;
        job.setId(result);
        Assert.assertEquals(result,job.getId());

    }
}