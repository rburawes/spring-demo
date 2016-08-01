package com.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Category details.
 */
@Component
public class Category {

    private String name;

    @Autowired
    private Product product;

    @PostConstruct
    private void init(){
        this.name = "Electronics & Gadgets";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Category [name=" + name + ", code=" + product + "]";
    }

}
