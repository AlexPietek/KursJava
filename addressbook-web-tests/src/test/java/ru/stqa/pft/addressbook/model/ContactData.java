package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {


  private String firstName;
  private String middleName;
  private String lastName;
  private String nickname;
  private String title;
  private String company;
  private String address;
  private String homeNumber;
  private String mobileNumber;
  private String workNumber;
  private String faxNumber;
  private String mailAdress1;
  private String mailAdress2;
  private String mailAdress3;
  private int id;
  private String group;

  public ContactData() {

  }

  public ContactData(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String homeNumber, String mobileNumber, String workNumber, String faxNumber, String mailAdress1, String mailAdress2, String mailAdress3, String group) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homeNumber = homeNumber;
    this.mobileNumber = mobileNumber;
    this.workNumber = workNumber;
    this.faxNumber = faxNumber;
    this.mailAdress1 = mailAdress1;
    this.mailAdress2 = mailAdress2;
    this.mailAdress3 = mailAdress3;
    this.group = group;
  }


  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomeNumber() {
    return homeNumber;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public String getWorkNumber() {
    return workNumber;
  }

  public String getFaxNumber() {
    return faxNumber;
  }

  public String getMailAdress1() {
    return mailAdress1;
  }

  public String getMailAdress2() {
    return mailAdress2;
  }

  public String getMailAdress3() {
    return mailAdress3;
  }

  public String getGroup() {
    return group;
  }

  public int getId() {
    return id;
  }

  public ContactData withId(int id) {
    this.id = id;
    return this;
  }

  public ContactData withFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }


  public ContactData withLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }


  public ContactData withAddress(String address) {
    this.address = address;
    return this;
  }

  public ContactData withHomeNumber(String homeNumber) {
    this.homeNumber = homeNumber;
    return this;
  }

  public ContactData withMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  public ContactData withWorkNumber(String workNumber) {
    this.workNumber = workNumber;
    return this;
  }

  public ContactData withMailAdress1(String mailAdress1) {
    this.mailAdress1 = mailAdress1;
    return this;
  }

  public ContactData withMailAdress2(String mailAdress2) {
    this.mailAdress2 = mailAdress2;
    return this;
  }

  public ContactData withMailAdress3(String mailAdress3) {
    this.mailAdress3 = mailAdress3;
    return this;
  }

  public ContactData withGroup(String group) {
    this.group = group;
    return this;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return id == that.id &&
            Objects.equals(firstName, that.firstName) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(address, that.address) &&
            Objects.equals(homeNumber, that.homeNumber) &&
            Objects.equals(mobileNumber, that.mobileNumber) &&
            Objects.equals(workNumber, that.workNumber) &&
            Objects.equals(mailAdress1, that.mailAdress1) &&
            Objects.equals(mailAdress2, that.mailAdress2) &&
            Objects.equals(mailAdress3, that.mailAdress3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, homeNumber, mobileNumber, workNumber, mailAdress1, mailAdress2, mailAdress3, id);
  }
}
