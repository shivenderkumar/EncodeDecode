package com.shivenderkumar.encodedecode.models;

public class NewTokenResponse {

    public String tId;
    public int locationId;
    public int chainId;
    public String locationCurrentDate;
    public String CurrentDateTime;
    public String WCLUrl;
    public NewTokenWLCDetailsResponse WLCDetails;
    public Object setOrderInfo;
    public Object orderNumber;
    public Object custInfo;
    public Object paypalInfo;

    @Override
    public String toString() {
        return "{" +
                "tId='" + tId + '\'' +
                ",locationId=" + locationId +
                ",chainId=" + chainId +
                ",locationCurrentDate='" + locationCurrentDate + '\'' +
                ",CurrentDateTime='" + CurrentDateTime + '\'' +
                ",WCLUrl='" + WCLUrl + '\'' +
                ",WLCDetails=" + WLCDetails +
                ",setOrderInfo=" + setOrderInfo +
                ",orderNumber=" + orderNumber +
                ",custInfo=" + custInfo +
                ",paypalInfo=" + paypalInfo +
                '}';
    }


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getChainId() {
        return chainId;
    }

    public void setChainId(int chainId) {
        this.chainId = chainId;
    }

    public String getLocationCurrentDate() {
        return locationCurrentDate;
    }

    public void setLocationCurrentDate(String locationCurrentDate) {
        this.locationCurrentDate = locationCurrentDate;
    }

    public String getCurrentDateTime() {
        return CurrentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.CurrentDateTime = currentDateTime;
    }

    public String getwCLUrl() {
        return WCLUrl;
    }

    public void setwCLUrl(String wCLUrl) {
        this.WCLUrl = wCLUrl;
    }

    public NewTokenWLCDetailsResponse getwLCDetails() {
        return WLCDetails;
    }

    public void setwLCDetails(NewTokenWLCDetailsResponse wLCDetails) {
        this.WLCDetails = wLCDetails;
    }

    public Object getSetOrderInfo() {
        return setOrderInfo;
    }

    public void setSetOrderInfo(Object setOrderInfo) {
        this.setOrderInfo = setOrderInfo;
    }

    public Object getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Object orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Object getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(Object custInfo) {
        this.custInfo = custInfo;
    }

    public Object getPaypalInfo() {
        return paypalInfo;
    }

    public void setPaypalInfo(Object paypalInfo) {
        this.paypalInfo = paypalInfo;
    }
}
