package com.shivenderkumar.encodedecode.models;

import androidx.annotation.NonNull;

public class NewTokenDataRequest {
    public String mobUrl;
    public String pid;
    public String tempOrderId;
    public String paypalToken;
    public String paypalPayerID;

    public NewTokenDataRequest(String mobUrl, String pid, String tempOrderId, String paypalToken, String paypalPayerID) {
        this.mobUrl = mobUrl;
        this.pid = pid;
        this.tempOrderId = tempOrderId;
        this.paypalToken = paypalToken;
        this.paypalPayerID = paypalPayerID;
    }

}
