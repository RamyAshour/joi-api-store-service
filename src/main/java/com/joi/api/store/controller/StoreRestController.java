/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.controller;


import com.joi.api.store.dto.StoreDTO;
import com.joi.api.store.dtohelper.StoreDTOHelper;
import com.joi.api.store.entity.Store;
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
 */
@RestController
@RequestMapping("/store")
public class StoreRestController {
    @Autowired
    private IStoreService storeService;
    
    
    @GetMapping("/all")
    public List<Store> getAllStores()
    {
       return storeService.getAllStores();
    }
    
    
     @GetMapping("/alldto")
    public List<StoreDTO> getStores()
    {
       return StoreDTOHelper.convertStoreToStoreDTO(storeService.getAllStores()) ;
    }
    
    @GetMapping("/bystate/{id}")
      public  List<Store> findAllByStateProvinceId(@PathVariable Integer id)
      {
          return storeService.findAllByStateProvinceId(id);
      }
      
      
     @GetMapping("/bycountry/{id}")
      public List<Store> findAllByCountry(@PathVariable Integer id)
      {
         return storeService.findAllByCountry(id);
      }
      
       @GetMapping("/bystateandgroupid/{stateId}/{groupId}")
      public  List<Store>findAllByStateProvinceIdAndStoreGroupId(@PathVariable Integer stateId,@PathVariable Integer groupId)
      {
         return storeService.findAllByStateProvinceIdAndStoreGroupId(stateId, groupId);
      }
      
      
      @Cacheable(value = "StoreRestController_findAllByCountryIdAndStoreGroupId" ,key = "{#p0,#p1}")
       @GetMapping("/bycountryandgroupid/{countryId}/{groupId}")
       public List<Store> findAllByCountryIdAndStoreGroupId(@PathVariable Integer countryId,@PathVariable Integer groupId)
       {
          return storeService.findAllByCountryIdAndStoreGroupId(countryId, groupId);
       }
    
}
