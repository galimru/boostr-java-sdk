package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class LeadSource {

  @SerializedName("name")
  private String name = null;

  @SerializedName("info")
  private String info = null;

  @SerializedName("url")
  private String url = null;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}

