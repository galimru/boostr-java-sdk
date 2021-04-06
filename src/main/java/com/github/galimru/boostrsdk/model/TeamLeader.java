package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class TeamLeader {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("email")
  private String email = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

