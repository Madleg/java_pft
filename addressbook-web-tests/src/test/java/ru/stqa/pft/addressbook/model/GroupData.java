package ru.stqa.pft.addressbook.model;

public class GroupData {
  private final String name;
  private final String header;
  private final String footer1;
  private final String footer2;

  public GroupData(String name, String header, String footer1, String footer2) {
    this.name = name;
    this.header = header;
    this.footer1 = footer1;
    this.footer2 = footer2;
  }

  public String getName() {
    return name;
  }

  public String getHeader() {
    return header;
  }

  public String getFooter1() {
    return footer1;
  }

  public String getFooter2() {
    return footer2;
  }
}
