package com.travel.exercise2.mvc;


import com.travel.exercise2.mvc.validation.RedentionCode;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Traveler {


    @Size(min = 3, message="name is required")
    String firstname;
    String lastname;
    @Min(value = 18, message = "must be older than 18 years")
    @Max(value = 100, message = "must be younger than 100 years")
    int age;
    String id;
    String cellphonenumber;
    String email;
    String country;
    String[] favoriteCountries;
    @RedentionCode
    String redentionCode;



    public Traveler() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCellphonenumber() {
        return cellphonenumber;
    }

    public void setCellphonenumber(String cellphonenumber) {
        this.cellphonenumber = cellphonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String[] getFavoriteCountries() {
        return favoriteCountries;
    }

    public void setFavoriteCountries(String[] favoriteCountries) {
        this.favoriteCountries = favoriteCountries;
    }

    public String getRedentionCode() {
        return redentionCode;
    }

    public void setRedentionCode(String redentionCode) {
        this.redentionCode = redentionCode;
    }
}
