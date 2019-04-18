package com.punchh.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Subscription implements Serializable {

    @SerializedName("subscription_id")
    @Expose
    private int subscriptionId;
    @SerializedName("subscription_name")
    @Expose
    private String subscriptionName;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("subscription_level_id")
    @Expose
    private int subscriptionLevelId;
    @SerializedName("stop_date")
    @Expose
    private String stopDate;
    @SerializedName("stripe_id")
    @Expose
    private String stripeId;
    @SerializedName("customer_id")
    @Expose
    private String customerId;
    @SerializedName("status")
    @Expose
    private String status;

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getSubscriptionLevelId() {
        return subscriptionLevelId;
    }

    public void setSubscriptionLevelId(int subscriptionLevelId) {
        this.subscriptionLevelId = subscriptionLevelId;
    }

    public String getStopDate() {
        return stopDate;
    }

    public void setStopDate(String stopDate) {
        this.stopDate = stopDate;
    }

    public String getStripeId() {
        return stripeId;
    }

    public void setStripeId(String stripeId) {
        this.stripeId = stripeId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
