/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.controller;

import com.joi.api.store.entity.Country;
import com.joi.api.store.service.ICountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Enhaqnce Labs
 */@RestController
 @RequestMapping("/country")
public class CountryRestController {
     
     @Autowired
     private ICountryService countryService;
     @GetMapping("/all")
     public List<Country> getAllCountries()
     {
        return countryService.getAllCountries();
     }
    
}
