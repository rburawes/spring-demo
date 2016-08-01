package com.demo.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Product details.
 */
@Component
public class Product {

    private String name;

    private String code;

    private int quantity;

    @PostConstruct
    private void init(){
        this.name = "JBL Extreme";
        this.code = "JBLXTREMEBLKUS";
        this.quantity = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", code=" + code + "]";
    }
}
