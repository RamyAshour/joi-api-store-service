/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.dto;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Id;

/**
 *
 * @author Heba_Tolla
 */
public class MobileCountryDTO {
    @Id
    private int id;
    
    private String name;
    private List<MobileStateProvinceDTO> stateProvincesList;

    public MobileCountryDTO()
    {
        
    }
//    public MobileCountryDTO( List<MobileStateProvinceDTO> stateProvinces)
//    {
//        setStateProvincesList(stateProvinces);
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MobileStateProvinceDTO> getStateProvincesList() {
        return stateProvincesList;
    }

    public void setStateProvincesList(List<MobileStateProvinceDTO> stateProvincesList) {
        this.stateProvincesList = stateProvincesList;
    }
    
}
