package ru.stqa.pft.addressbook.model;

public class ContactData {


  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String homeNumber;
  private final String mobileNumber;
  private final String workNumber;
  private final String faxNumber;
  private final String mailAdress1;
  private final String mailAdress2;
  private final String mailAdress3;
  private int id;
  private String group;

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

  public ContactData(int id, String lastName, String firstName, String address, String mailAdress1, String mailAdress2, String mailAdress3, String homeNumber, String mobileNumber, String workNumber) {
    this.id = id;
    this.firstName = firstName;
    this.middleName = null;
    this.lastName = lastName;
    this.nickname = null;
    this.title = null;
    this.company = null;
    this.address = address;
    this.homeNumber = homeNumber;
    this.mobileNumber = mobileNumber;
    this.workNumber = workNumber;
    this.faxNumber = null;
    this.mailAdress1 = mailAdress1;
    this.mailAdress2 = mailAdress2;
    this.mailAdress3 = mailAdress3;
    this.group = null;
  }

  public ContactData(int id, String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String homeNumber, String mobileNumber, String workNumber, String faxNumber, String mailAdress1, String mailAdress2, String mailAdress3, String group) {
    this.id = id;
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

    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }
}
