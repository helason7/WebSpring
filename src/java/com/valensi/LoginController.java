/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.dao.CustomerService;
import com.valensi.bean.LoginFormBean;
import com.valensi.entity.Mstcustomer;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    CustomerService cs;

    @RequestMapping()
    public String goToLogin(Model model) {
        LoginFormBean loginBean = new LoginFormBean();
        model.addAttribute("loginBean", loginBean);
        return "login";
    }

    @RequestMapping(value = "/validation")
    public String checkLogin(HttpSession session, @ModelAttribute("loginBean") LoginFormBean loginBean, Model model) {
        Mstcustomer customer = cs.findByUsername(loginBean.getUsername());
        if(customer.getUsername()== null) {
            model.addAttribute("errMsg", "Username salah");
            return "login";
        }
        
        session.setAttribute("user", customer);
        
        return "redirect:/product/all";
    }
    
}
