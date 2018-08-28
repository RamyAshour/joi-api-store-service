/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.Country;
import java.util.List;

/**
 *
 * @author Enhaqnce Labs
 */
public interface ICountryService {
    
    List<Country> getAllCountries();
    
}
