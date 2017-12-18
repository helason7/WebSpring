/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MSTCUSTOMER")
@NamedQueries({
    @NamedQuery(name = "Mstcustomer.findAll", query = "SELECT m FROM Mstcustomer m")
    , @NamedQuery(name = "Mstcustomer.findById", query = "SELECT m FROM Mstcustomer m WHERE m.id = :id")
    , @NamedQuery(name = "Mstcustomer.findByAddress", query = "SELECT m FROM Mstcustomer m WHERE m.address = :address")
    , @NamedQuery(name = "Mstcustomer.findByEmail", query = "SELECT m FROM Mstcustomer m WHERE m.email = :email")
    , @NamedQuery(name = "Mstcustomer.findByNamalengkap", query = "SELECT m FROM Mstcustomer m WHERE m.namalengkap = :namalengkap")
    , @NamedQuery(name = "Mstcustomer.findByPassword", query = "SELECT m FROM Mstcustomer m WHERE m.password = :password")
    , @NamedQuery(name = "Mstcustomer.findByPhone", query = "SELECT m FROM Mstcustomer m WHERE m.phone = :phone")
    , @NamedQuery(name = "Mstcustomer.findByUsername", query = "SELECT m FROM Mstcustomer m WHERE m.username = :username")})
public class Mstcustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "NAMALENGKAP")
    private String namalengkap;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "USERNAME")
    private String username;
    @OneToMany(mappedBy = "customerId")
    private List<Mstorder> mstorderList;

    public Mstcustomer() {
    }

    public Mstcustomer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Mstorder> getMstorderList() {
        return mstorderList;
    }

    public void setMstorderList(List<Mstorder> mstorderList) {
        this.mstorderList = mstorderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mstcustomer)) {
            return false;
        }
        Mstcustomer other = (Mstcustomer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.entity.Mstcustomer[ id=" + id + " ]";
    }
    
}
