/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.dto;

import com.joi.api.store.entity.Store;
import java.util.List;
import javax.persistence.Id;

/**
 *
 * @author Heba_Tolla
 */
public class MobileStateProvinceDTO {
      
    private int storeId; 
   // private String storeName;
    private int stateId; 
    private String stateName;
   // private List<MobileStoreDTO> storeList;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

   
  
}
