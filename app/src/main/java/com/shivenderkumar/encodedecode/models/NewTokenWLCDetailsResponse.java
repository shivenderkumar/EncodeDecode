package com.shivenderkumar.encodedecode.models;

public class NewTokenWLCDetailsResponse {
    public String WlcId;
    public String DefaultURL;
    public String mDefaultURL;
    public String ErrorURL;
    public String mErrorURL;
    public String InactiveURL;
    public String mInactiveURL;
    public String MaintenanceURL;
    public String mMaintenanceURL;

    @Override
    public String toString() {
        return "{" +
                "WlcId='" + WlcId + '\'' +
                ",DefaultURL='" + DefaultURL + '\'' +
                ",mDefaultURL='" + mDefaultURL + '\'' +
                ",ErrorURL='" + ErrorURL + '\'' +
                ",mErrorURL='" + mErrorURL + '\'' +
                ",InactiveURL='" + InactiveURL + '\'' +
                ",mInactiveURL='" + mInactiveURL + '\'' +
                ",MaintenanceURL='" + MaintenanceURL + '\'' +
                ",mMaintenanceURL='" + mMaintenanceURL + '\'' +
                '}';
    }

    public String getWlcId() {
        return WlcId;
    }

    public void setWlcId(String wlcId) {
        this.WlcId = wlcId;
    }

    public String getDefaultURL() {
        return DefaultURL;
    }

    public void setDefaultURL(String defaultURL) {
        this.DefaultURL = defaultURL;
    }

    public String getmDefaultURL() {
        return mDefaultURL;
    }

    public void setmDefaultURL(String mDefaultURL) {
        this.mDefaultURL = mDefaultURL;
    }

    public String getErrorURL() {
        return ErrorURL;
    }

    public void setErrorURL(String errorURL) {
        this.ErrorURL = errorURL;
    }

    public String getmErrorURL() {
        return mErrorURL;
    }

    public void setmErrorURL(String mErrorURL) {
        this.mErrorURL = mErrorURL;
    }

    public String getInactiveURL() {
        return InactiveURL;
    }

    public void setInactiveURL(String inactiveURL) {
        this.InactiveURL = inactiveURL;
    }

    public String getmInactiveURL() {
        return mInactiveURL;
    }

    public void setmInactiveURL(String mInactiveURL) {
        this.mInactiveURL = mInactiveURL;
    }

    public String getMaintenanceURL() {
        return MaintenanceURL;
    }

    public void setMaintenanceURL(String maintenanceURL) {
        this.MaintenanceURL = maintenanceURL;
    }

    public String getmMaintenanceURL() {
        return mMaintenanceURL;
    }

    public void setmMaintenanceURL(String mMaintenanceURL) {
        this.mMaintenanceURL = mMaintenanceURL;
    }
}
