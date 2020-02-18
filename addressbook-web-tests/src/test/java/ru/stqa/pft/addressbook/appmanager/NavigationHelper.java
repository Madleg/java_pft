package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
  private ChromeDriver wd;

  public NavigationHelper(ChromeDriver wd) {
    this.wd = wd;

  }

  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}
