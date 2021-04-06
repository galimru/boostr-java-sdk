package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class DealContact {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("works_at")
  private String worksAt = null;

  @SerializedName("position")
  private String position = null;

  @SerializedName("role")
  private String role = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWorksAt() {
    return worksAt;
  }

  public void setWorksAt(String worksAt) {
    this.worksAt = worksAt;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }
}

