/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.repository;

import com.joi.api.store.entity.Country;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Enhaqnce Labs
 */@Repository
public interface CountryRepository extends JpaRepository<Country,Serializable> {
    
}
