package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Deal {

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("next_steps")
  private String nextSteps = null;

  @SerializedName("start_date")
  private LocalDate startDate = null;

  @SerializedName("end_date")
  private LocalDate endDate = null;

  @SerializedName("stage_id")
  private Integer stageId = null;

  @SerializedName("budget")
  private BigDecimal budget = null;

  @SerializedName("budget_loc")
  private BigDecimal budgetLoc = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("lead_id")
  private Integer leadId = null;

  @SerializedName("advertiser_id")
  private Integer advertiserId = null;

  @SerializedName("agency_id")
  private Integer agencyId = null;

  @SerializedName("custom_fields")
  private Object customFields = null;

  @SerializedName("deal_members")
  private List<DealMember> dealMembers = null;

  @SerializedName("deal_contacts")
  private List<DealContact> dealContacts = null;

  @SerializedName("integrations_attributes")
  private List<DealIntegration> integrationsAttributes = null;

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

  public Integer getStageId() {
    return stageId;
  }

  public void setStageId(Integer stageId) {
    this.stageId = stageId;
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

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Integer getLeadId() {
    return leadId;
  }

  public void setLeadId(Integer leadId) {
    this.leadId = leadId;
  }

  public Integer getAdvertiserId() {
    return advertiserId;
  }

  public void setAdvertiserId(Integer advertiserId) {
    this.advertiserId = advertiserId;
  }

  public Integer getAgencyId() {
    return agencyId;
  }

  public void setAgencyId(Integer agencyId) {
    this.agencyId = agencyId;
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

  public List<DealIntegration> getIntegrationsAttributes() {
    return integrationsAttributes;
  }

  public void setIntegrationsAttributes(List<DealIntegration> integrationsAttributes) {
    this.integrationsAttributes = integrationsAttributes;
  }

  public Wrapper asWrapper() {
    return new Wrapper(this);
  }

  public static class Wrapper {

    @SerializedName("deal")
    private Deal deal = null;

    public Wrapper(Deal deal) {
      this.deal = deal;
    }

    public Deal getDeal() {
      return deal;
    }

    public void setDeal(Deal deal) {
      this.deal = deal;
    }
  }
}

