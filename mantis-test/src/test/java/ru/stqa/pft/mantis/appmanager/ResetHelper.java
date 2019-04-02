package ru.stqa.pft.mantis.appmanager;

import org.openqa.selenium.By;

public class ResetHelper extends HelperBase {
  public ResetHelper(ApplicationManager app) {
    super(app);
  }

  public void login(String login, String password) {
    wd.get(app.getProperty("web.baseUrl") + "/login_page.php");
    type(By.name("username"), login);
    type(By.name("email"), password);
    click(By.cssSelector("input[value='Login']"));
  }
}
