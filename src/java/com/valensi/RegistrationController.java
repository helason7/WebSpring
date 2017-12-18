/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.bean.RegisterFormBean;
import com.valensi.dao.CustomerService;
import com.valensi.entity.Mstcustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping("/register")
public class RegistrationController {
    
    @Autowired
    CustomerService cs;
    
    @RequestMapping() 
    public String registerForm(Model model) {
        RegisterFormBean registerBean = new RegisterFormBean();
        //registerBean.setLastName("Smith");
        model.addAttribute("registerBean", registerBean);
        return "registration";
    }
    
    @RequestMapping(value="/save") 
    public String saveRegistration(@ModelAttribute("registerBean") RegisterFormBean registerBean, 
            Model model) {
        Mstcustomer customer = new Mstcustomer();
        customer.setNamalengkap(registerBean.getNamaLengkap());
        customer.setAddress(registerBean.getAddress());
        customer.setEmail(registerBean.getEmail());
        customer.setPhone(registerBean.getPhone());
        customer.setUsername(registerBean.getUsername());
        customer.setPassword(registerBean.getPassword());
        cs.addCustomer(customer);
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
    
}
