/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.service;

import com.joi.api.store.entity.Store;

import java.util.List;



/**
 *
 * @author Enhaqnce Labs
 */
public interface IStoreService {
    
    List<Store> getAllStores();
    List<Store> findAllByStateProvinceId(Integer id);
    List<Store> findAllByCountry(Integer id);
    List<Store>findAllByStateProvinceIdAndStoreGroupId(Integer stateId,Integer groupId);
    List<Store>findAllByCountryIdAndStoreGroupId( Integer countryId,Integer groupId);
    
}
