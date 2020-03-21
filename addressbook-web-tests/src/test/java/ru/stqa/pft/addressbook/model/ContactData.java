package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String secondname;
  private String group;

  public ContactData(String firstname, String secondname) {
    this.firstname = firstname;
    this.secondname = secondname;

  }


  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return secondname;
  }

  public String getGroup() {
    return group;
  }
}
