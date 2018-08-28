/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.repository;

import com.joi.api.store.entity.State;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Enhaqnce Labs
 */@Repository
public interface StateRepository extends JpaRepository<State,Serializable>{
     
     List<State> findAllByCountryId(Integer id);
     
     
    
}
