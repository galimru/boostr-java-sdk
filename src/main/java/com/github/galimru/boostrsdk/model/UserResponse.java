package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class UserResponse {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("win_rate")
  private String winRate = null;

  @SerializedName("average_deal_size")
  private String averageDealSize = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("is_active")
  private Boolean isActive = null;

  @SerializedName("team")
  private UserTeam team = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWinRate() {
    return winRate;
  }

  public void setWinRate(String winRate) {
    this.winRate = winRate;
  }

  public String getAverageDealSize() {
    return averageDealSize;
  }

  public void setAverageDealSize(String averageDealSize) {
    this.averageDealSize = averageDealSize;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  public UserTeam getTeam() {
    return team;
  }

  public void setTeam(UserTeam team) {
    this.team = team;
  }
}

