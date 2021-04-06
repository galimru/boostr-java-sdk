package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

public class DealResponse {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("next_steps")
  private String nextSteps = null;

  @SerializedName("stage_name")
  private String stageName = null;

  @SerializedName("stage_id")
  private Integer stageId = null;

  @SerializedName("deal_type")
  private String dealType = null;

  @SerializedName("advertiser_id")
  private Integer advertiserId = null;

  @SerializedName("advertiser_name")
  private String advertiserName = null;

  @SerializedName("agency_id")
  private Integer agencyId = null;

  @SerializedName("agency_name")
  private String agencyName = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("budget")
  private BigDecimal budget = null;

  @SerializedName("budget_loc")
  private BigDecimal budgetLoc = null;

  @SerializedName("lead_id")
  private Integer leadId = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  @SerializedName("deal_members")
  private List<DealMember> dealMembers = null;

  @SerializedName("deal_contacts")
  private List<DealContact> dealContacts = null;

  @SerializedName("integrations")
  private List<DealIntegration> integrations = null;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public String getNextSteps() {
    return nextSteps;
  }

  public void setNextSteps(String nextSteps) {
    this.nextSteps = nextSteps;
  }

  public String getStageName() {
    return stageName;
  }

  public void setStageName(String stageName) {
    this.stageName = stageName;
  }

  public Integer getStageId() {
    return stageId;
  }

  public void setStageId(Integer stageId) {
    this.stageId = stageId;
  }

  public String getDealType() {
    return dealType;
  }

  public void setDealType(String dealType) {
    this.dealType = dealType;
  }

  public Integer getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
  }

  public String getAdvertiserName() {
    return advertiserName;
  }

  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }

  public Integer getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(Integer agencyId) {
    this.agencyId = agencyId;
  }

  public String getAgencyName() {
    return agencyName;
  }

  public void setAgencyName(String agencyName) {
    this.agencyName = agencyName;
  }

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }

  public BigDecimal getBudgetLoc() {
    return budgetLoc;
  }

  public void setBudgetLoc(BigDecimal budgetLoc) {
    this.budgetLoc = budgetLoc;
  }

  public Integer getLeadId() {
    return leadId;
  }

  public void setLeadId(Integer leadId) {
    this.leadId = leadId;
  }

  public Object getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Object customFields) {
    this.customFields = customFields;
  }

  public List<DealMember> getDealMembers() {
    return dealMembers;
  }

  public void setDealMembers(List<DealMember> dealMembers) {
    this.dealMembers = dealMembers;
  }

  public List<DealContact> getDealContacts() {
    return dealContacts;
  }

  public void setDealContacts(List<DealContact> dealContacts) {
    this.dealContacts = dealContacts;
  }

  public List<DealIntegration> getIntegrations() {
    return integrations;
  }

  public void setIntegrations(List<DealIntegration> integrations) {
    this.integrations = integrations;
  }
}

