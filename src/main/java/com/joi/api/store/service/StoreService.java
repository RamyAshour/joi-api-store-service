/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.Store;
import com.joi.api.store.repository.StoreRepository;

import java.util.List;
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
          return storeRepository.findAll();
    }

    @Override
    public List<Store> findAllByStateProvinceId(Integer id) {
             return storeRepository.findAllByStateProvinceId(id);
    }

    @Override
    public List<Store> findAllByCountry(Integer id) {
          return storeRepository.findAllByCountry(id);
    }

    @Override
    public List<Store> findAllByStateProvinceIdAndStoreGroupId(Integer stateId, Integer groupId) {
            return storeRepository.findAllByStateProvinceIdAndStoreGroupId(stateId, groupId);
    }

    @Override
    public List<Store> findAllByCountryIdAndStoreGroupId(Integer countryId, Integer groupId) {
        return storeRepository.findAllByCountryIdAndStoreGroupId(countryId, groupId);
    }
    
}
