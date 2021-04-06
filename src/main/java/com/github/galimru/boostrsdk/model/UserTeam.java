package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class UserTeam {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("members_count")
  private Integer membersCount = null;

  @SerializedName("top_parent")
  private TeamParent topParent = null;

  @SerializedName("parent")
  private TeamParent parent = null;

  @SerializedName("leader")
  private TeamLeader leader = null;

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

  public Integer getMembersCount() {
    return membersCount;
  }

  public void setMembersCount(Integer membersCount) {
    this.membersCount = membersCount;
  }

  public TeamParent getTopParent() {
    return topParent;
  }

  public void setTopParent(TeamParent topParent) {
    this.topParent = topParent;
  }

  public TeamParent getParent() {
    return parent;
  }

  public void setParent(TeamParent parent) {
    this.parent = parent;
  }

  public TeamLeader getLeader() {
    return leader;
  }

  public void setLeader(TeamLeader leader) {
    this.leader = leader;
  }
}

