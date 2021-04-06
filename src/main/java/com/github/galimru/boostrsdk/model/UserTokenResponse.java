package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class UserTokenResponse {

  @SerializedName("jwt")
  private String jwt = null;

  public String getJwt() {
    return jwt;
  }

  public void setJwt(String jwt) {
    this.jwt = jwt;
  }
}

