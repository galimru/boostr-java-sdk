package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserList {

  @SerializedName("users")
  private List<UserResponse> users = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("active")
  private Integer active = null;

  @SerializedName("inactive")
  private Integer inactive = null;

  public List<UserResponse> getUsers() {
    return users;
  }

  public void setUsers(List<UserResponse> users) {
    this.users = users;
  }

  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public Integer getInactive() {
    return inactive;
  }

  public void setInactive(Integer inactive) {
    this.inactive = inactive;
  }
}

