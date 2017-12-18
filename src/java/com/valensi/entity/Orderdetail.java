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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "ORDERDETAIL")
@NamedQueries({
    @NamedQuery(name = "Orderdetail.findAll", query = "SELECT o FROM Orderdetail o")
    , @NamedQuery(name = "Orderdetail.findById", query = "SELECT o FROM Orderdetail o WHERE o.id = :id")
    , @NamedQuery(name = "Orderdetail.findByNamaCustomer", query = "SELECT o FROM Orderdetail o WHERE o.namaCustomer = :namaCustomer")
    , @NamedQuery(name = "Orderdetail.findByNamaProduk", query = "SELECT o FROM Orderdetail o WHERE o.namaProduk = :namaProduk")
    , @NamedQuery(name = "Orderdetail.findByQty", query = "SELECT o FROM Orderdetail o WHERE o.qty = :qty")
    , @NamedQuery(name = "Orderdetail.findByTotalBelanja", query = "SELECT o FROM Orderdetail o WHERE o.totalBelanja = :totalBelanja")})
public class Orderdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAMA_CUSTOMER")
    private String namaCustomer;
    @Column(name = "NAMA_PRODUK")
    private String namaProduk;
    @Column(name = "QTY")
    private Integer qty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_BELANJA")
    private Double totalBelanja;

    public Orderdetail() {
    }

    public Orderdetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Double getTotalBelanja() {
        return totalBelanja;
    }

    public void setTotalBelanja(Double totalBelanja) {
        this.totalBelanja = totalBelanja;
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
        if (!(object instanceof Orderdetail)) {
            return false;
        }
        Orderdetail other = (Orderdetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.valensi.entity.Orderdetail[ id=" + id + " ]";
    }
    
}
