package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public class Lead {

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("company_name")
  private String companyName = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("budget")
  private String budget = null;

  @SerializedName("source_url")
  private String sourceUrl = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("product_name")
  private String productName = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("rejected_reason")
  private String rejectedReason = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("contact_id")
  private String contactId = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("source")
  private LeadSource source = null;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getBudget() {
    return budget;
  }

  public void setBudget(String budget) {
    this.budget = budget;
  }

  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getRejectedReason() {
    return rejectedReason;
  }

  public void setRejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public LeadSource getSource() {
    return source;
  }

  public void setSource(LeadSource source) {
    this.source = source;
  }

  public Wrapper asWrapper() {
    return new Wrapper(this);
  }

  public static class Wrapper {

    @SerializedName("lead")
    private Lead lead = null;

    public Wrapper(Lead lead) {
      this.lead = lead;
    }

    public Lead getLead() {
      return lead;
    }

    public void setLead(Lead lead) {
      this.lead = lead;
    }
  }
}

