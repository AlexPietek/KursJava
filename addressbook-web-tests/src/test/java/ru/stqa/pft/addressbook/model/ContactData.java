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
  private String homePhone;
  private String mobilePhone;
  private String workPhone;
  private String faxNumber;
  private String mailAdress1;
  private String mailAdress2;
  private String mailAdress3;
  private int id;
  private String group;
  private String allPhones;
  private String allMails;

  public String getAllInfo() {
    return allInfo;
  }

  public ContactData withAllInfo(String allInfo) {
    this.allInfo = allInfo;
    return this;
  }

  private String allInfo;

  public ContactData() {

  }


  public String getAllPhones() {
    return allPhones;
  }

  public ContactData withAllPhones(String allPhones) {
    this.allPhones = allPhones;
    return this;
  }

  public String getAllMails() {
    return allMails;
  }

  public ContactData withAllMails(String allMails) {
    this.allMails = allMails;
    return this;
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

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
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

  public ContactData withHomePhone(String homePhone) {
    this.homePhone = homePhone;
    return this;
  }

  public ContactData withMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  public ContactData withWorkPhone(String workPhone) {
    this.workPhone = workPhone;
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
            Objects.equals(homePhone, that.homePhone) &&
            Objects.equals(mobilePhone, that.mobilePhone) &&
            Objects.equals(workPhone, that.workPhone) &&
            Objects.equals(mailAdress1, that.mailAdress1) &&
            Objects.equals(mailAdress2, that.mailAdress2) &&
            Objects.equals(mailAdress3, that.mailAdress3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, address, homePhone, mobilePhone, workPhone, mailAdress1, mailAdress2, mailAdress3, id);
  }
}
