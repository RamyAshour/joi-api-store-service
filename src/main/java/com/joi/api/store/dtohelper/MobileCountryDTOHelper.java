/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joi.api.store.dtohelper;

import com.joi.api.store.Global;
import com.joi.api.store.dto.MobileCountryDTO;
import com.joi.api.store.dto.MobileStateProvinceDTO;
import com.joi.api.store.dto.MobileStoreDTO;
import com.joi.api.store.entity.Country;
import com.joi.api.store.entity.State;
import com.joi.api.store.entity.Store;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heba_Tolla
 */
public class MobileCountryDTOHelper {

    public static List<MobileCountryDTO> convertCountryToMobileCountryDto(List<Country> countries, List<Store> stores, byte languageId, int storeGroup) {
        List<MobileCountryDTO> mobileCountryDTOsList = new ArrayList<MobileCountryDTO>();
        MobileStateProvinceDTO stateProvinceDTO;
        List<MobileStateProvinceDTO> mobileStateProvinceDTOList;
//      List<MobileStateProvinceDTO> stateProvinceDTOList;
        for (Country c : countries) {

            MobileCountryDTO mobileCountryDTO = new MobileCountryDTO();
            mobileCountryDTO.setStateProvincesList(new ArrayList<MobileStateProvinceDTO>());
//              stateProvinceDTOList=new ArrayList<MobileStateProvinceDTO>();
            mobileCountryDTO.setId(c.getId());
            mobileCountryDTO.setName(c.getName());
            for (int i = 0; i < stores.size(); i++) {
                if (c.getId() == stores.get(i).getCountryId() && stores.get(i).getStoreGroupId() == storeGroup) {
                    stateProvinceDTO = new MobileStateProvinceDTO();
                    stateProvinceDTO.setStateId(stores.get(i).getStateId());
                    stateProvinceDTO.setStoreId(stores.get(i).getId());
                    if (languageId == Global.LANGUAGE_AR) {
                        stateProvinceDTO.setStateName(stores.get(i).getStateNameAr());
                    } else {
                        stateProvinceDTO.setStateName(stores.get(i).getStateNameEn());
                    }

//                    stateProvinceDTOList.add(stateProvinceDTO);
                    mobileCountryDTO.getStateProvincesList().add(stateProvinceDTO);
                }
                //  mobileCountryDTO.getStateProvincesList().add(stateProvinceDTOList);
            }
            // mobileCountryDTO=new MobileCountryDTO();
            //  mobileCountryDTO.setStateProvincesList(new ArrayList<MobileStateProvinceDTO>());
            // mobileCountryDTO.setId(c.getId());
            // mobileCountryDTO.setName(c.getName());
            // mobileStateProvinceDTOList=convertStateToMobileStateProvinceDTO(c.getId(),states,stores);
            // for(int i=0;i<mobileStateProvinceDTOList.size();i++)
            // {
            //  mobileCountryDTO.getStateProvincesList().add(mobileStateProvinceDTOList.get(i));
            // }
            // mobileCountryDTO.setStateProvincesList(convertStateToMobileStateProvinceDTO(c.getId(),states,stores));

            mobileCountryDTOsList.add(mobileCountryDTO);

        }

        return mobileCountryDTOsList;
    }
//  public static  List<MobileStateProvinceDTO> convertStateToMobileStateProvinceDTO(int countryId,List<State>states,List<Store>stores)
//    {
//        List<MobileStateProvinceDTO> stateProvinceDTOsList=new ArrayList<MobileStateProvinceDTO>();
//        MobileStateProvinceDTO stateProvinceDTO;
//        List<MobileStoreDTO>storeList;
//        MobileStoreDTO mobileStoreDTO;
//        for(State s:states)
//        {
//            if(s.getCountryId()==countryId)
//            {
//               stateProvinceDTO=new MobileStateProvinceDTO();
//               stateProvinceDTO.setId(s.getId());
//               stateProvinceDTO.setName(s.getName());
//               stateProvinceDTO.setStoreList(new ArrayList<MobileStoreDTO>());
//               storeList=new ArrayList<MobileStoreDTO>();
//               for(Store st:stores){
//                   mobileStoreDTO=new MobileStoreDTO();
//                   if(s.getId()==st.getStateProvinceId())
//                   {
//                      if(!storeList.contains(st.getId())) 
//                      {
//                          mobileStoreDTO.setId(st.getId());
//                          mobileStoreDTO.setName(st.getName());
//                         stateProvinceDTO.getStoreList().add(mobileStoreDTO);
//                         storeList.add(mobileStoreDTO);
//                      }
//                   }
//               }
//              stateProvinceDTOsList.add(stateProvinceDTO);
//            }
//        }
//        return stateProvinceDTOsList;
//    }

}
