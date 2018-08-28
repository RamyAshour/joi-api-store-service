/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.controller;

import com.joi.api.store.entity.State;
import com.joi.api.store.service.IStateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Enhaqnce Labs
 */@RestController
 @RequestMapping("/State")
public class StateRestController {
     
     @Autowired
     private IStateService stateService;
     
     @GetMapping("/all")
     public List<State> getAllStates()
     {
       return stateService.getAllStates();
     }
     
     @GetMapping("/bycountry/{id}")
     public  List<State>findAllStatesByCountry(@PathVariable Integer id)
     {
         return stateService.findAllStatesByCountry(id);
     }
     
      @GetMapping("/{id}")
      public State FindOneById( @PathVariable Integer id)
      {
          return stateService.FindOneById(id);
      }
      
      
    
    
}
