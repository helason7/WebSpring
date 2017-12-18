/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "MSTORDER")
@NamedQueries({
    @NamedQuery(name = "Mstorder.findAll", query = "SELECT m FROM Mstorder m")
    , @NamedQuery(name = "Mstorder.findById", query = "SELECT m FROM Mstorder m WHERE m.id = :id")
    , @NamedQuery(name = "Mstorder.findByProductId", query = "SELECT m FROM Mstorder m WHERE m.productId = :productId")
    , @NamedQuery(name = "Mstorder.findByProductName", query = "SELECT m FROM Mstorder m WHERE m.productName = :productName")})
public class Mstorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "ID")
    @ManyToOne
    private Mstcustomer customerId;

    public Mstorder() {
    }

    public Mstorder(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Mstcustomer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Mstcustomer customerId) {
        this.customerId = customerId;
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
        if (!(object instanceof Mstorder)) {
            return false;
        }
        Mstorder other = (Mstorder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.entity.Mstorder[ id=" + id + " ]";
    }
    
}
