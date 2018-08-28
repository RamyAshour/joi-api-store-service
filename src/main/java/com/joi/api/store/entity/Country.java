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
public class Country {
     @Id
     @Column(name="Id")
     private Integer id;
     @Column(name="Name")
     private String name;
     @Column(name="AllowsBilling")
     private boolean allowsBilling;
     @Column(name="AllowsShipping")
     private boolean allowsShipping;
     @Column(name="TwoLetterIsoCode")
     private String twoLetterIsoCode;
     @Column(name="ThreeLetterIsoCode")
     private String threeLetterIsoCode;
      @Column(name="NumericIsoCode")
     private Integer numericIsoCode;
     @Column(name="SubjectToVat")
     private boolean subjectToVat;
     @Column(name="Published")
     private boolean published;  
     @Column(name="DisplayOrder")
     private Integer displayOrder;
     @Column(name="LimitedToStores")
     private boolean limitedToStores;  

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

    public boolean isAllowsBilling() {
        return allowsBilling;
    }

    public void setAllowsBilling(boolean allowsBilling) {
        this.allowsBilling = allowsBilling;
    }

    public boolean isAllowsShipping() {
        return allowsShipping;
    }

    public void setAllowsShipping(boolean allowsShipping) {
        this.allowsShipping = allowsShipping;
    }

    public String getTwoLetterIsoCode() {
        return twoLetterIsoCode;
    }

    public void setTwoLetterIsoCode(String twoLetterIsoCode) {
        this.twoLetterIsoCode = twoLetterIsoCode;
    }

    public String getThreeLetterIsoCode() {
        return threeLetterIsoCode;
    }

    public void setThreeLetterIsoCode(String threeLetterIsoCode) {
        this.threeLetterIsoCode = threeLetterIsoCode;
    }

    public Integer getNumericIsoCode() {
        return numericIsoCode;
    }

    public void setNumericIsoCode(Integer numericIsoCode) {
        this.numericIsoCode = numericIsoCode;
    }

    public boolean isSubjectToVat() {
        return subjectToVat;
    }

    public void setSubjectToVat(boolean subjectToVat) {
        this.subjectToVat = subjectToVat;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public boolean isLimitedToStores() {
        return limitedToStores;
    }

    public void setLimitedToStores(boolean limitedToStores) {
        this.limitedToStores = limitedToStores;
    }

}
