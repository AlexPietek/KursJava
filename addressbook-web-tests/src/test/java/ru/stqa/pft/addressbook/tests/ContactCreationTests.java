package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.Contacts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.goTo().gotoHomePage();
    Contacts before = app.contact().all();
    app.contact().initContactCreation();
    ContactData contact = new ContactData().withFirstName("Adam")
            .withLastName("Jackowski")
            .withAddress("Warszawa")
            .withMailAdress1("myMail1")
            .withMailAdress2("myMail2")
            .withMailAdress3("myMail3")
            .withHomeNumber("111")
            .withMobileNumber("222")
            .withWorkNumber("333")
            .withGroup("test1");
    app.contact().create(contact);
    Contacts after = app.contact().all();
    assertThat(after, equalTo(before.withAdded(contact.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt()))));
    assertThat(after.size(), equalTo(before.size() + 1));
  }
}
