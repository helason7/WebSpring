/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.utils;

import com.valensi.Cart;
import com.valensi.entity.Tblproduct;
import java.util.Map;

/**
 *
 * @author user
 */
public class TesCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cart cart = new Cart();
        Tblproduct prod1 = new Tblproduct();
        prod1.setProductNama("PATU");
        
        Tblproduct prod2 = new Tblproduct();
        prod2.setProductNama("PAKU");
        
        cart.getCarts().put(1, prod1);
        cart.getCarts().put(2, prod2);
        
        Map<Integer, Tblproduct> cartsa = cart.getCarts();
        
        cart.getCarts().values();
        
        for (Map.Entry<Integer, Tblproduct> entry : cartsa.entrySet()) {
//            Integer key = entry.getKey();
            Tblproduct value = entry.getValue();
            System.out.println("Product Name: " + value.getProductNama());
        }
    }
    
}
