package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
  public ContactHelper(WebDriver wd)
  {
    super(wd);
  }
  public void submitContactCreation() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("middlename"), contactData.getMiddleName());
    type(By.name("lastname"),contactData.getLastName());
    type(By.name("nickname"),contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"),contactData.getCompany());
    type(By.name("address"),contactData.getAddress());
    type(By.name("home"),contactData.getHomeNumber());
    type(By.name("mobile"),contactData.getMobileNumber());
    type(By.name("work"),contactData.getWorkNumber());
    type(By.name("fax"), contactData.getFaxNumber());
    type(By.name("email"),contactData.getMailAdress1());
    type(By.name("email2"),contactData.getMailAdress2());
    type(By.name("email3"),contactData.getMailAdress3());

    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }
}
