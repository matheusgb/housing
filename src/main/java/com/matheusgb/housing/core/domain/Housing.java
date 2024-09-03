package com.matheusgb.housing.core.domain;

public class Housing {
  private String id;
  private String type;
  private String zipCode;
  private Address address;

  public Housing() {
    this.isValidZipCode = false;
  }

  public Housing(String id, String type, String zipCode, Address address, Boolean isValidzipCode) {
    this.id = id;
    this.type = type;
    this.zipCode = zipCode;
    this.address = address;
    this.isValidZipCode = isValidzipCode;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipcode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Boolean getIsValidZipCode() {
    return isValidZipCode;
  }

  public void setIsValidZipcode(Boolean isValidZipCode) {
    this.isValidZipCode = isValidZipCode;
  }

  private Boolean isValidZipCode;
}
