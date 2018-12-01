package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Adam", "None", "Jackowski", "TestMaster", "Master", "Legia Warszawa", "Warszawa", "111", "222", "333", "444", "myMail1", "myMail2", "myMail3", "test1"));
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContacts();
    //app.getGroupHelper().returnToGroupPage();
  }

}