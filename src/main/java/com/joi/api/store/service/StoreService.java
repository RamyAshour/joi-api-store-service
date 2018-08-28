/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.Store;
import com.joi.api.store.repository.StoreRepository;

import java.util.List;
import javax.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Enhaqnce Labs
 */
@Service
public class StoreService implements IStoreService {

     @Autowired
     private StoreRepository storeRepository;
    @Override
    public List<Store> getAllStores() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return storeRepository.findAll();
    }

    @Override
    public List<Store> findAllByStateProvinceId(Integer id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return storeRepository.findAllByStateProvinceId(id);
    }

    @Override
    public List<Store> findAllByCountry(Integer id) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return storeRepository.findAllByCountry(id);
    }

    @Override
    public List<Store> findAllByStateProvinceIdAndStoreGroupId(Integer stateId, Integer groupId) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return storeRepository.findAllByStateProvinceIdAndStoreGroupId(stateId, groupId);
    }

    @Override
    public List<Store> findAllByCountryIdAndStoreGroupId(Integer countryId, Integer groupId) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return storeRepository.findAllByCountryIdAndStoreGroupId(countryId, groupId);
    }
    
}
