package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class DealMember {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("share")
  private Integer share = null;

  @SerializedName("type")
  private String type = null;

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

  public Integer getShare() {
    return share;
  }

  public void setShare(Integer share) {
    this.share = share;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}

