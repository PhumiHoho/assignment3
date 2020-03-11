package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person person;
    Job job;

    @Before
    public void setUp() throws Exception {
        person=new Person();
        job=new Job();
    }

    @Test
    public void getSalary() {
        int result =12000;
        job.setSalary(result);
        Assert.assertEquals(result,person.getSalary());
    }
}