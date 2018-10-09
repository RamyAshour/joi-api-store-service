
package com.joi.api.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Enhaqnce Labs
 */


@Entity
@Table(name="flat_store")
public class Store {
    @Id
    @Column(name="Id")        
    private Integer id;
    @Column(name="Name")
    private String name;
    @Column(name="Url")
    private String url;
    @Column(name="SslEnabled")
    private boolean sslEnabled;  
    @Column(name="SecureUrl")
    private String secureUrl;
    @Column(name="Hosts")
    private String hosts;
    @Column(name="DefaultLanguageId")        
    private Integer defaultLanguageId;
    @Column(name="DisplayOrder")        
    private Integer displayOrder;
    @Column(name="CompanyName")
    private String companyName;
    @Column(name="CompanyAddress")
    private String companyAddress;
    @Column(name="CompanyPhoneNumber")
    private String companyPhoneNumber;
    @Column(name="CompanyVat")
    private String companyVat;
    @Column(name="StateProvinceId")        
    private Integer stateProvinceId;
    @Column(name="SupportEmail")
    private String supportEmail;
    @Column(name="TimeZoneId")
    private String timeZoneId;
    @Column(name="StoreGroupId")        
    private Integer storeGroupId;
    @Column(name="PhoneNumber")
    private String phoneNumber;
    @Column(name="NewOrderMail")
    private String newOrderMail;
    @Column(name="AssetUrl")
    private String assetUrl;
    @Column(name="ApiUrl")
    private String apiUrl;

    @Column(name="ar_name")
    private String arabicName;
    @Column(name="currency_id")
    private Long currencyId;
    @Column(name="currency_en_name")
    private String currencyEnName;
    @Column(name="currency_ar_name")
    private String currencyArName;
    @Column(name="currency_code")
    private String currencyCode;
    @Column(name="state_en_name")
    private String stateEnName;
    @Column(name="state_ar_name")
    private String stateArName;
    @Column(name="country_id")
    private short countryId;
    @Column(name="country_en_name")
    private String countryEnName;
    @Column(name="country_ar_name")
    private String countryArName;
    @Column(name="store_group_name")
    private String storeGroupName;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyEnName() {
        return currencyEnName;
    }

    public void setCurrencyEnName(String currencyEnName) {
        this.currencyEnName = currencyEnName;
    }

    public String getCurrencyArName() {
        return currencyArName;
    }

    public void setCurrencyArName(String currencyArName) {
        this.currencyArName = currencyArName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getStateEnName() {
        return stateEnName;
    }

    public void setStateEnName(String stateEnName) {
        this.stateEnName = stateEnName;
    }

    public String getStateArName() {
        return stateArName;
    }

    public void setStateArName(String stateArName) {
        this.stateArName = stateArName;
    }

    public short getCountryId() {
        return countryId;
    }

    public void setCountryId(short countryId) {
        this.countryId = countryId;
    }

    public String getCountryEnName() {
        return countryEnName;
    }

    public void setCountryEnName(String countryEnName) {
        this.countryEnName = countryEnName;
    }

    public String getCountryArName() {
        return countryArName;
    }

    public void setCountryArName(String countryArName) {
        this.countryArName = countryArName;
    }

    public String getStoreGroupName() {
        return storeGroupName;
    }

    public void setStoreGroupName(String storeGroupName) {
        this.storeGroupName = storeGroupName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }

    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public String getSecureUrl() {
        return secureUrl;
    }

    public void setSecureUrl(String secureUrl) {
        this.secureUrl = secureUrl;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    public Integer getDefaultLanguageId() {
        return defaultLanguageId;
    }

    public void setDefaultLanguageId(Integer defaultLanguageId) {
        this.defaultLanguageId = defaultLanguageId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getCompanyVat() {
        return companyVat;
    }

    public void setCompanyVat(String companyVat) {
        this.companyVat = companyVat;
    }

    public Integer getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(Integer stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public String getSupportEmail() {
        return supportEmail;
    }

    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    public Integer getStoreGroupId() {
        return storeGroupId;
    }

    public void setStoreGroupId(Integer storeGroupId) {
        this.storeGroupId = storeGroupId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNewOrderMail() {
        return newOrderMail;
    }

    public void setNewOrderMail(String newOrderMail) {
        this.newOrderMail = newOrderMail;
    }

    public String getAssetUrl() {
        return assetUrl;
    }

    public void setAssetUrl(String assetUrl) {
        this.assetUrl = assetUrl;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApi_Url(String apiUrl) {
        this.apiUrl = apiUrl;
    }
    
}
