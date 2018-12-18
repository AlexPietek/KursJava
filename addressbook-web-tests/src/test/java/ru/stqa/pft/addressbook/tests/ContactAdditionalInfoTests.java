package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContactAdditionalInfoTests extends TestBase{

  @Test
  public void testAdditionalInfo() {
    app.goTo().gotoHomePage();
    ContactData contact = app.contact().all().iterator().next();
    ContactData contactToCompare = app.contact().infoFromEditForm(contact);
    app.goTo().gotoHomePage();
    app.contact().showDetailsById(contact.getId());
    ContactData contactInfo = app.contact().contactInfo();
    assertThat(cleaned(contactInfo.getAllInfo()), equalTo(mergeAllData(contactToCompare)));

  }
  private String mergeAllData(ContactData contact){
    return Arrays.asList(contact.getFirstName()+ contact.getLastName(), contact.getAddress(), contact.getHomePhone(), contact.getMobilePhone(),contact.getWorkPhone(), contact.getMailAdress1(),contact.getMailAdress2(), contact.getMailAdress3())
            .stream().filter((s) -> !s.equals(""))
            .map(ContactAdditionalInfoTests::cleaned)
            .collect(Collectors.joining(""));
  }


  public static String cleaned(String field) {
    return field.replaceAll("\\s+", "")
            .replaceAll("\n+", "")
            .replaceAll("H:", "")
            .replaceAll("M:", "")
            .replaceAll("W:", "");
  }
}
