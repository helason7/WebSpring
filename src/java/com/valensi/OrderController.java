/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.dao.ProductService;
import com.valensi.entity.Tblproduct;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    ProductService ps;

    Cart cart = new Cart();
    int no = 1;

    @RequestMapping(value = "/add/{productID}")
    public String addCart(@PathVariable Integer productID, Model model, HttpSession session) {

        try {
            Tblproduct prod = ps.findById(productID);
            if (prod == null) {
                model.addAttribute("errMsg", "Belom ada barang yg dipilih");
                return "tblproduct";
            }
            cart.getCarts().put(no++, prod);
            int count = cart.getCarts().size();
            model.addAttribute("carts", count);
            session.setAttribute("cart", cart);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/product/all";
    }
    
    @RequestMapping(value = "/show")
    public String showCart(Model model, HttpSession session) {
        return "cartok";
    }

    @RequestMapping(value = "/{productID}/{value}")
    public String removeCart(@PathVariable Integer productID, Model model, HttpSession session) {

        try {
            Tblproduct prod = ps.findById(productID);
            if (prod == null) {
                model.addAttribute("errMsg", "Belom ada barang yg dipilih");
                return "tblproduct";
            }
            cart.getCarts().remove(no, prod);
            cart.getCarts().remove(ps);
            int count = cart.getCarts().size();
            System.out.println("tot: "+count);
            model.addAttribute("carts", count);
            session.setAttribute("cartsess", cart);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cartok";
    }
}
