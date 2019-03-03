package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.Groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GroupModificationTests extends TestBase {


  @BeforeMethod
  public void ensurePrecondicions() {
    if(app.db().groups().size() == 0)
    {
      app.goTo().groupPage();
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void testGroupModification() {
    Groups before = app.db().groups();
    GroupData modifiedGroup = before.iterator().next();
    GroupData group = new GroupData().withId(modifiedGroup.getId())
            .withName(app.properties().getProperty("groupModifiedName"))
            .withHeader(app.properties().getProperty("groupModifiedHeader"))
            .withFooter(app.properties().getProperty("groupModifiedFooter"));
    app.goTo().groupPage();
    app.group().modify(group);
    assertThat(app.group().count(), equalTo(before.size()));
    Groups after = app.db().groups();
    Groups test = before.without(modifiedGroup).withAdded(group);
    assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));
  }


}
