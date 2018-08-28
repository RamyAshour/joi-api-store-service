/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.repository;

import com.joi.api.store.entity.Store;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Enhaqnce Labs
 */@Repository
public interface StoreRepository extends JpaRepository<Store,Serializable>{
     
     List<Store> findAllByStateProvinceId(Integer id);
     @Query("select s from Store s where s.stateProvinceId in (select a.id From State a where a.countryId=:id)")
     List<Store> findAllByCountry(@Param("id") Integer id);
     List<Store>findAllByStateProvinceIdAndStoreGroupId(Integer stateId,Integer groupId);
     @Query("select s from Store s where s.stateProvinceId in (select a.id From State a where a.countryId=:cId) and s.storeGroupId=:sId")
     List<Store>findAllByCountryIdAndStoreGroupId(@Param("cId") Integer countryId,@Param("sId") Integer groupId);
    
}
