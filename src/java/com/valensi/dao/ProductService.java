/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.dao;

import com.valensi.entity.Tblproduct;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */
@Repository
@Transactional
public class ProductService {
    
    @PersistenceContext
    private EntityManager em;

    public ProductService() {
    }

    public ProductService(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    public void addProduct(Tblproduct prod){
        this.em.persist(prod);
    }
    
    public List<Tblproduct> findAll(){
        List<Tblproduct> prod;
        prod = this.em.createNamedQuery("Tblproduct.findAll").getResultList();
        return prod;
    }
    
    public Tblproduct findById(Integer id){
        return em.find(Tblproduct.class, id);
    }
    
}
