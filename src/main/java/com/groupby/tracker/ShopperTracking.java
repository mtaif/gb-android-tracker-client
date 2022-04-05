
package com.groupby.tracker;

import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.groupby.tracker.model.Login;


/**
 * shopper tracking component
 * <p>
 * The data used to anonymously track a shopper. See property descriptions for details on how this is anonymous tracking as opposed to tracking that infringes on the privacy of the shopper.
 * 
 */
class ShopperTracking implements Parcelable
{

    /**
     * The shopper's visitor ID, which uniquely identifies their client (ex. their web browser or their install of a native app). It should expire one year after the most recent activity from the shopper on that particular client. To ensure the shopper isn't tracked across the internet, this cannot be a value generated by another party that may identify the shopper across the entire internet. For example, it cannot be an ID generated by an analytics vendor such as Google Analytics. This ID can be generated and expired at the appropriate time by code written by the GroupBy customer, or a GroupBy SDK can be used to send requests to the API using this schema, in which case details related to generating and expiring the value are taken care of for the GroupBy customer.
     * (Required)
     * 
     */
    @SerializedName("visitorId")
    @Expose
    private String visitorId;
    /**
     * Data about the shopper's logged in/logged out status.This complex object is used instead of an optional string to help us avoid problems we've had in the past where a customer thinks that when the shopper is logged out, they're supposed to put a string value like "anonymous" in the optional string property. We think this will help us avoid this confusion.
     * (Required)
     * 
     */
    @SerializedName("login")
    @Expose
    private Login login;
    public final static Creator<ShopperTracking> CREATOR = new Creator<ShopperTracking>() {


        @SuppressWarnings({
            "unchecked"
        })
        public ShopperTracking createFromParcel(android.os.Parcel in) {
            return new ShopperTracking(in);
        }

        public ShopperTracking[] newArray(int size) {
            return (new ShopperTracking[size]);
        }

    }
    ;

    protected ShopperTracking(android.os.Parcel in) {
        this.visitorId = ((String) in.readValue((String.class.getClassLoader())));
        this.login = ((Login) in.readValue((Login.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShopperTracking() {
    }

    /**
     * 
     * @param login
     * @param visitorId
     */
    public ShopperTracking(String visitorId, Login login) {
        super();
        this.visitorId = visitorId;
        this.login = login;
    }

    /**
     * The shopper's visitor ID, which uniquely identifies their client (ex. their web browser or their install of a native app). It should expire one year after the most recent activity from the shopper on that particular client. To ensure the shopper isn't tracked across the internet, this cannot be a value generated by another party that may identify the shopper across the entire internet. For example, it cannot be an ID generated by an analytics vendor such as Google Analytics. This ID can be generated and expired at the appropriate time by code written by the GroupBy customer, or a GroupBy SDK can be used to send requests to the API using this schema, in which case details related to generating and expiring the value are taken care of for the GroupBy customer.
     * (Required)
     * 
     */
    public String getVisitorId() {
        return visitorId;
    }

    /**
     * The shopper's visitor ID, which uniquely identifies their client (ex. their web browser or their install of a native app). It should expire one year after the most recent activity from the shopper on that particular client. To ensure the shopper isn't tracked across the internet, this cannot be a value generated by another party that may identify the shopper across the entire internet. For example, it cannot be an ID generated by an analytics vendor such as Google Analytics. This ID can be generated and expired at the appropriate time by code written by the GroupBy customer, or a GroupBy SDK can be used to send requests to the API using this schema, in which case details related to generating and expiring the value are taken care of for the GroupBy customer.
     * (Required)
     * 
     */
    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    /**
     * Data about the shopper's logged in/logged out status.This complex object is used instead of an optional string to help us avoid problems we've had in the past where a customer thinks that when the shopper is logged out, they're supposed to put a string value like "anonymous" in the optional string property. We think this will help us avoid this confusion.
     * (Required)
     * 
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Data about the shopper's logged in/logged out status.This complex object is used instead of an optional string to help us avoid problems we've had in the past where a customer thinks that when the shopper is logged out, they're supposed to put a string value like "anonymous" in the optional string property. We think this will help us avoid this confusion.
     * (Required)
     * 
     */
    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ShopperTracking.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("visitorId");
        sb.append('=');
        sb.append(((this.visitorId == null)?"<null>":this.visitorId));
        sb.append(',');
        sb.append("login");
        sb.append('=');
        sb.append(((this.login == null)?"<null>":this.login));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.login == null)? 0 :this.login.hashCode()));
        result = ((result* 31)+((this.visitorId == null)? 0 :this.visitorId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShopperTracking) == false) {
            return false;
        }
        ShopperTracking rhs = ((ShopperTracking) other);
        return (((this.login == rhs.login)||((this.login!= null)&&this.login.equals(rhs.login)))&&((this.visitorId == rhs.visitorId)||((this.visitorId!= null)&&this.visitorId.equals(rhs.visitorId))));
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(visitorId);
        dest.writeValue(login);
    }

    public int describeContents() {
        return  0;
    }

}
