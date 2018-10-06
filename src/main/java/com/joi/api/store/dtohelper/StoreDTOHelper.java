/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.dtohelper;

import com.joi.api.store.Global;
import com.joi.api.store.dto.StoreDTO;
import com.joi.api.store.entity.Store;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heba_Tolla
 */
public class StoreDTOHelper {
    
    public static List<StoreDTO> convertStoreToStoreDTO(List<Store> stores)
    {
        List<StoreDTO>storeDTOList=new ArrayList<StoreDTO>();
        StoreDTO storeDTO=new StoreDTO();
        for(Store store:stores)
        {
            storeDTO.setId(store.getId());
            storeDTO.setUrl(store.getUrl());
            storeDTO.setName(store.getName());
            
            storeDTOList.add(storeDTO);
        }
        return storeDTOList;
    }
    
}
