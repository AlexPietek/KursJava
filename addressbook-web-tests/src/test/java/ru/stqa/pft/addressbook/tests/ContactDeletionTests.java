package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;


public class ContactDeletionTests extends TestBase {
  @BeforeMethod
  public void ensurePrecondicions() {
    app.goTo().gotoHomePage();
    if (!app.contact().isThereAContact()) {
      app.contact().create(new ContactData().withFirstName("Adam")
              .withLastName("Jackowski")
              .withAddress("Warszawa")
              .withMailAdress1("myMail1")
              .withMailAdress2("myMail2")
              .withMailAdress3("myMail3")
              .withHomeNumber("111")
              .withMobileNumber("222")
              .withWorkNumber("333")
              .withGroup("test1"));
    }
  }

  @Test
  public void testContactDeletion() {
    Contacts before = app.contact().all();
    ContactData deletedContact = before.iterator().next();
    app.contact().delete(deletedContact);
    app.goTo().gotoHomePage();
    Contacts after = app.contact().all();
    assertEquals(after.size(), before.size() - 1);
    assertThat(after, equalTo(before.without(deletedContact)));
  }
}