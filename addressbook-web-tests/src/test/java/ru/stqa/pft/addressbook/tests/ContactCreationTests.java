package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Adam", "None", "Jackowski", "TestMaster", "Master", "Legia Warszawa", "Warszawa", "111", "222", "333", "444", "myMail1", "myMail2", "myMail3", "test1"));
    app.getContactHelper().submitContactCreation();
  }
}
