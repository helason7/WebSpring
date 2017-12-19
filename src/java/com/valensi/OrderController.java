/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.dao.ProductService;
import com.valensi.entity.Tblproduct;
import java.util.Map;
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

    int no = 1;
    double totalHarga;

    @RequestMapping(value = "/add/{productID}")
    public String addCart(@PathVariable Integer productID, Model model, HttpSession session) {

            Tblproduct prod = ps.findById(productID);
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                session.setAttribute("errMsg", "Belom ada barang yg dipilih");
                cart = new Cart();
                
            }
            cart.getCarts().put(no++, prod);
            int count = cart.getCarts().size();
            session.setAttribute("carts", count);

        session.setAttribute("cart", cart);
        return "redirect:/product/all";
    }
    
    @RequestMapping(value = "/show")
    public String showCart(Model model, HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        Map<Integer, Tblproduct> carts = cart.getCarts();
        Double total = 0.0;
        for (Map.Entry<Integer, Tblproduct> entry : carts.entrySet()) {
            Tblproduct value = entry.getValue();
            total = total + value.getHarga();
        }
        totalHarga = total;
        model.addAttribute("total", total);
        return "cartok";
    }

    @RequestMapping(value = "/{productID}/{value}")
    public String removeCart(@PathVariable Integer productID, @PathVariable Integer value, Model model, HttpSession session) {

        try {
            Tblproduct prod = ps.findById(productID);
            if (prod == null) {
//                model.addAttribute("errMsg", "Belom ada barang yg dipilih");
                return "tblproduct";
            }
            Double total;
            totalHarga = totalHarga - prod.getHarga();
            Cart cart = (Cart) session.getAttribute("cart");
            cart.getCarts().remove(value, prod);
            int count = cart.getCarts().size();
            model.addAttribute("total", totalHarga);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cartok";
    }
    
    @RequestMapping(value="/checkout")
    public String checkOut(HttpSession session){
        session.setAttribute("carts", 0);
        session.removeAttribute("cart");
        return "redirect:/logout";
    }
}
