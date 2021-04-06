package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class LeadResponse {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("account")
  private String account = null;

  @SerializedName("contact")
  private String contact = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("budget")
  private String budget = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  @SerializedName("rejected_at")
  private String rejectedAt = null;

  @SerializedName("rejected_reason")
  private String rejectedReason = null;

  @SerializedName("accepted_at")
  private String acceptedAt = null;

  @SerializedName("reassigned_at")
  private String reassignedAt = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("source")
  private LeadSource source = null;

  @SerializedName("user")
  private Object user = null;

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

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getBudget() {
    return budget;
  }

  public void setBudget(String budget) {
    this.budget = budget;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getRejectedAt() {
    return rejectedAt;
  }

  public void setRejectedAt(String rejectedAt) {
    this.rejectedAt = rejectedAt;
  }

  public String getRejectedReason() {
    return rejectedReason;
  }

  public void setRejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
  }

  public String getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(String acceptedAt) {
    this.acceptedAt = acceptedAt;
  }

  public String getReassignedAt() {
    return reassignedAt;
  }

  public void setReassignedAt(String reassignedAt) {
    this.reassignedAt = reassignedAt;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public LeadSource getSource() {
    return source;
  }

  public void setSource(LeadSource source) {
    this.source = source;
  }

  public Object getUser() {
    return user;
  }

  public void setUser(Object user) {
    this.user = user;
  }
}

