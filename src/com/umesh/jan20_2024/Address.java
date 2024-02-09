package com.umesh.jan20_2024;

public class Address {

  private String no;
  private String street;

  public Address(final String no, final String street) {
    this.no = no;
    this.street = street;
  }

  @Override
  public String toString() {
    return "Address{" +
        "no='" + no + '\'' +
        ", street='" + street + '\'' +
        '}';
  }

  public String getNo() {
    return no;
  }

  public void setNo(final String no) {
    this.no = no;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(final String street) {
    this.street = street;
  }
}
