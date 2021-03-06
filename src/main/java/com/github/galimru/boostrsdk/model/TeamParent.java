package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class TeamParent {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

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
}

