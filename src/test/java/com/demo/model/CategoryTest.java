package com.demo.model;

import com.demo.ApplicationConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test things on {@link Category}.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class})
public class CategoryTest {

    @Autowired
    private Category category;

    @Test
    public void testCategoryNotNull(){
        Assert.assertTrue(category != null);
        Assert.assertTrue(category.getName().equals("Electronics & Gadgets"));
    }

    @Test
    public void testCategoryProduct(){
        Assert.assertTrue(category.getProduct().getName().equals("JBL Extreme"));
        Assert.assertTrue(category.getProduct().getCode().equals("JBLXTREMEBLKUS"));
        Assert.assertTrue(category.getProduct().getQuantity() == 5);
    }
}