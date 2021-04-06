package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class UserToken {

  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Wrapper asWrapper() {
    return new Wrapper(this);
  }

  public static class Wrapper {

    @SerializedName("auth")
    private UserToken auth;

    public Wrapper(UserToken auth) {
      this.auth = auth;
    }

    public UserToken getAuth() {
      return auth;
    }

    public void setAuth(UserToken auth) {
      this.auth = auth;
    }
  }
}

