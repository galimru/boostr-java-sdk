package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class DealIntegration {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("external_id")
  private Integer externalId = null;

  @SerializedName("external_type")
  private String externalType = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getExternalId() {
    return externalId;
  }

  public void setExternalId(Integer externalId) {
    this.externalId = externalId;
  }

  public String getExternalType() {
    return externalType;
  }

  public void setExternalType(String externalType) {
    this.externalType = externalType;
  }
}

