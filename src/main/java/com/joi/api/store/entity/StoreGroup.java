/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Enhaqnce Labs
 */@Entity
public class StoreGroup {
     
//     Id	int
//Name	nvarchar
//SeoCode	nvarchar
     
      @Id
     @Column(name="Id")
     private Integer id;
     @Column(name="Name")
     private String name;
     @Column(name="SeoCode")
     private String seoCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeoCode() {
        return seoCode;
    }

    public void setSeoCode(String seoCode) {
        this.seoCode = seoCode;
    }
      
    
}
