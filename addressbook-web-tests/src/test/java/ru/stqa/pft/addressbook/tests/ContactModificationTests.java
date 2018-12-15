package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

public class ContactModificationTests extends TestBase {
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
  public void testContactModification() {

    Contacts before = app.contact().all();
    ContactData modifiedContact = before.iterator().next();
    ContactData contact = new ContactData().withFirstName("Adam")
            .withLastName("Jackowski")
            .withAddress("Warszawa")
            .withMailAdress1("myMail1")
            .withMailAdress2("myMail2")
            .withMailAdress3("myMail3")
            .withHomeNumber("111")
            .withMobileNumber("222")
            .withWorkNumber("333")
            .withGroup("test1")
            .withId(modifiedContact.getId());
    app.contact().modify(contact);
    Contacts after = app.contact().all();
    assertEquals(after.size(), before.size());
    assertThat(after, equalTo(before.without(modifiedContact).withAdded(contact)));
  }
}
