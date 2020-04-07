package ru.stqa.pft.addressbook.model;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "GroupData{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
