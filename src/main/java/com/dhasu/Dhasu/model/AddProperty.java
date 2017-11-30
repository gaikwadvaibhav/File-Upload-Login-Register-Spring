package com.dhasu.Dhasu.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by raj on 19/11/17.
 */
@Document
public class AddProperty {

    String propertyPostedby;
    String fullName;
    String email;
    String mobile;
    String companyName;
    String aboutBuilder;

    String propertyType;
    String aboutProperty;
    String state;
    String city;
    String propertyName;
    String locality;
    String address;

    String selectAddProperty;
    String noOfFlats;
    String availableFor;
    String averageArea;
    String startingPrice;
    String projectTotalTower;
    String projectTotalUnit;
    String projectAvailableUnit;
    String projectLaunchDate;

    @Override
    public String toString() {
        return "AddProperty{" +
                "propertyPostedby='" + propertyPostedby + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", companyName='" + companyName + '\'' +
                ", aboutBuilder='" + aboutBuilder + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", aboutProperty='" + aboutProperty + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", propertyName='" + propertyName + '\'' +
                ", locality='" + locality + '\'' +
                ", address='" + address + '\'' +
                ", selectAddProperty='" + selectAddProperty + '\'' +
                ", noOfFlats='" + noOfFlats + '\'' +
                ", availableFor='" + availableFor + '\'' +
                ", averageArea='" + averageArea + '\'' +
                ", startingPrice='" + startingPrice + '\'' +
                ", projectTotalTower='" + projectTotalTower + '\'' +
                ", projectTotalUnit='" + projectTotalUnit + '\'' +
                ", projectAvailableUnit='" + projectAvailableUnit + '\'' +
                ", projectLaunchDate='" + projectLaunchDate + '\'' +
                '}';
    }

    public String getPropertyPostedby() {
        return propertyPostedby;
    }

    public void setPropertyPostedby(String propertyPostedby) {
        this.propertyPostedby = propertyPostedby;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAboutBuilder() {
        return aboutBuilder;
    }

    public void setAboutBuilder(String aboutBuilder) {
        this.aboutBuilder = aboutBuilder;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getAboutProperty() {
        return aboutProperty;
    }

    public void setAboutProperty(String aboutProperty) {
        this.aboutProperty = aboutProperty;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSelectAddProperty() {
        return selectAddProperty;
    }

    public void setSelectAddProperty(String selectAddProperty) {
        this.selectAddProperty = selectAddProperty;
    }

    public String getNoOfFlats() {
        return noOfFlats;
    }

    public void setNoOfFlats(String noOfFlats) {
        this.noOfFlats = noOfFlats;
    }

    public String getAvailableFor() {
        return availableFor;
    }

    public void setAvailableFor(String availableFor) {
        this.availableFor = availableFor;
    }

    public String getAverageArea() {
        return averageArea;
    }

    public void setAverageArea(String averageArea) {
        this.averageArea = averageArea;
    }

    public String getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(String startingPrice) {
        this.startingPrice = startingPrice;
    }

    public String getProjectTotalTower() {
        return projectTotalTower;
    }

    public void setProjectTotalTower(String projectTotalTower) {
        this.projectTotalTower = projectTotalTower;
    }

    public String getProjectTotalUnit() {
        return projectTotalUnit;
    }

    public void setProjectTotalUnit(String projectTotalUnit) {
        this.projectTotalUnit = projectTotalUnit;
    }

    public String getProjectAvailableUnit() {
        return projectAvailableUnit;
    }

    public void setProjectAvailableUnit(String projectAvailableUnit) {
        this.projectAvailableUnit = projectAvailableUnit;
    }

    public String getProjectLaunchDate() {
        return projectLaunchDate;
    }

    public void setProjectLaunchDate(String projectLaunchDate) {
        this.projectLaunchDate = projectLaunchDate;
    }

    //
//    String coveredArea;
//    String areaUnit;
//    String plotAreaUnit;
//    String carpetArea;
//    String carpetAreaUnit;
//    String plotLenght;
//    String plotArea;
//    String pricePerSqft;
//    String plotBreadth;
//    String ageOfProperty;
//    String newProperty;
//    String reSale;
//    String projectDate;
//    String readyToMove;
//    String underConstruction;



}
