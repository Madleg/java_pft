package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
  private int id = Integer.MAX_VALUE;
  private String name;
  private String header;
  private String footer1;
  private String footer2;



  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }


  public GroupData withId(int id) {
    this.id = id;
    return this;
  }


  public GroupData withName(String name) {
    this.name = name;
    return this;
  }

  public GroupData withHeader(String header) {
    this.header = header;
    return this;
  }

  public GroupData withFooter1(String footer1) {
    this.footer1 = footer1;
    return this;
  }

  public GroupData withFooter2(String footer2) {
    this.footer2 = footer2;
    return this;
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
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return id == groupData.id &&
            Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }
}
