package com.lmars.pojo;

public class TbWmsContact {
    private Long id;

    private Long wmsId;

    private String person;

    private String organization;

    private String position;

    private String addresstype;

    private String address;

    private String city;

    private String stateorprovince;

    private String country;

    private String postcode;

    private String voicetelephone;

    private String facsimiletelephone;

    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWmsId() {
        return wmsId;
    }

    public void setWmsId(Long wmsId) {
        this.wmsId = wmsId;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(String addresstype) {
        this.addresstype = addresstype == null ? null : addresstype.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStateorprovince() {
        return stateorprovince;
    }

    public void setStateorprovince(String stateorprovince) {
        this.stateorprovince = stateorprovince == null ? null : stateorprovince.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getVoicetelephone() {
        return voicetelephone;
    }

    public void setVoicetelephone(String voicetelephone) {
        this.voicetelephone = voicetelephone == null ? null : voicetelephone.trim();
    }

    public String getFacsimiletelephone() {
        return facsimiletelephone;
    }

    public void setFacsimiletelephone(String facsimiletelephone) {
        this.facsimiletelephone = facsimiletelephone == null ? null : facsimiletelephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}