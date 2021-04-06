package com.github.galimru.boostrsdk.model;

import com.google.gson.annotations.SerializedName;

public enum DateCondition {
    @SerializedName("<")
    LESS,
    @SerializedName(">")
    GREATER,
    @SerializedName("<=")
    LESS_OR_EQUAL,
    @SerializedName(">=")
    GREATER_OR_EQUAL,
    @SerializedName("=")
    EQUAL;
}
