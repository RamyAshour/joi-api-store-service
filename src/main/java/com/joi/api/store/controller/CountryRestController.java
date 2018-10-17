/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.controller;

import com.joi.api.store.dto.MobileCountryDTO;
import com.joi.api.store.dtohelper.MobileCountryDTOHelper;
import com.joi.api.store.entity.Country;
import com.joi.api.store.service.ICountryService;
import com.joi.api.store.service.IStateService;
import com.joi.api.store.service.IStoreService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
     @Autowired
     private IStateService stateService;
      @Autowired
      private IStoreService storeService;
     
     @GetMapping("/all")
     public List<Country> getAllCountries()
     {
        return countryService.getAllCountries();
     }
     @Cacheable(value = "CountryRestController_getAllMobileCountries" ,key = "{#p0,#p1}")
     @GetMapping("/mobilecountry/{languageid}/{storegroup}")
     public List<MobileCountryDTO> getAllMobileCountries(@PathVariable("languageid")byte languageId, @PathVariable("storegroup")int storeGroup)
     {
        
         return MobileCountryDTOHelper.convertCountryToMobileCountryDto(countryService.getAllCountries(), storeService.getAllStores(),languageId,storeGroup);
     }
    
}
