package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student() {
            @Override
            public double interest() {
                int i = 0;
                return i;
            }
        };
    }

    @Test
    public void getLoanAmount() {
        Assert.assertEquals(123,student.getLoanAmount());
    }

    @Test
    public void testToString() {
        Assert.assertNotNull(student.toString());
    }
}