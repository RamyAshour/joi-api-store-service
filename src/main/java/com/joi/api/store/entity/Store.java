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
@Table(name = "flat_store")
public class Store {

    @Id
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Url")
    private String url;
    @Column(name = "SslEnabled")
    private boolean sslEnabled;
    @Column(name = "SecureUrl")
    private String secureUrl;
    @Column(name = "Hosts")
    private String hosts;
    @Column(name = "DefaultLanguageId")
    private Integer defaultLanguageId;
    @Column(name = "DisplayOrder")
    private Integer displayOrder;
    @Column(name = "CompanyName")
    private String companyName;
    @Column(name = "CompanyAddress")
    private String companyAddress;
    @Column(name = "CompanyPhoneNumber")
    private String companyPhoneNumber;
    @Column(name = "CompanyVat")
    private String companyVat;
    @Column(name = "StateProvinceId")
    private Integer stateProvinceId;
    @Column(name = "SupportEmail")
    private String supportEmail;
    @Column(name = "TimeZoneId")
    private String timeZoneId;
    @Column(name = "StoreGroupId")
    private Integer storeGroupId;
    @Column(name = "PhoneNumber")
    private String phoneNumber;
    @Column(name = "NewOrderMail")
    private String newOrderMail;
    @Column(name = "AssetUrl")
    private String assetUrl;
    @Column(name = "ApiUrl")
    private String apiUrl;
    @Column(name = "currency_name")
    private String currencyName;
    @Column(name = "currency_id")
    private int currencyId;
    @Column(name = "currency_Code")
    private String currencyCode;
    @Column(name = "customer_formatting")
    private String customerformatting;
    @Column(name = "state_name_ar")
    private String stateNameAr;
    @Column(name = " state_name_en")
    private String stateNameEn;
    @Column(name = "state_id")
    private int stateId;
    @Column(name = "country_id")
    private int countryId;

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

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCustomerformatting() {
        return customerformatting;
    }

    public void setCustomerformatting(String customerformatting) {
        this.customerformatting = customerformatting;
    }

    @Override
    public boolean equals(Object obj) {

        boolean result = this.id.equals(((Store) obj).getId());
        //  System.out.println(">>>>>>" + result);
        return result;
    }

    public String getStateNameAr() {
        return stateNameAr;
    }

    public void setStateNameAr(String stateNameAr) {
        this.stateNameAr = stateNameAr;
    }

    public String getStateNameEn() {
        return stateNameEn;
    }

    public void setStateNameEn(String stateNameEn) {
        this.stateNameEn = stateNameEn;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

}
