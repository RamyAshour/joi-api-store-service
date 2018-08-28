/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.Country;
import com.joi.api.store.repository.CountryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Enhaqnce Labs
 */@Service
public class CountryService implements ICountryService {
     
     @Autowired
     private CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return countryRepository.findAll();
    }
    
}
