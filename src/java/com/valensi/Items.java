/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.entity.Tblproduct;

/**
 *
 * @author user
 */
public class Items {
    
    private int quantity;
    private Tblproduct product;
    
    public Items() {
    }

    public Items(int quantity, Tblproduct product) {
        this.quantity = quantity;
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the product
     */
    public Tblproduct getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Tblproduct product) {
        this.product = product;
    }
}
