package com.demo.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test things on {@link Employee}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-beans.xml"})
public class EmployeeTest {

    @Autowired
    private Employee employee;

    @Test
    public void testEmployeeNotNull(){
        Assert.assertTrue(employee != null);
        Assert.assertTrue(employee.getType().equals("Full-time"));
    }

    @Test
    public void testEmployeePerson(){
        Assert.assertTrue(employee.getPerson().getFirstName().equals("John"));
        Assert.assertTrue(employee.getPerson().getLastName().equals("Doe"));
        Assert.assertTrue(employee.getType().equals("Full-time"));
    }

}