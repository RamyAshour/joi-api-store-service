/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.State;
import com.joi.api.store.repository.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

/**
 *
 * @author Enhaqnce Labs
 */@Service
public class StateService implements IStateService {
     
     @Autowired
     private StateRepository stateRepository;

    @Override
    public List<State> getAllStates() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return stateRepository.findAll();
    }
  @Override
    public List<State> findAllStatesByCountry(Integer id) {
//        State s= new State();
//        s.setCountryId(id);
//    Example<State> example = Example.of(s); 
//    return stateRepository.findAll(example);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return stateRepository.findAllByCountryId(id);
    }

    @Override
    public State FindOneById(Integer id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return stateRepository.findOne(id);
    }
    
}
