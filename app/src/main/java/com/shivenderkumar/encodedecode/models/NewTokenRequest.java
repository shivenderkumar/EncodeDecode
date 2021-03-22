package com.shivenderkumar.encodedecode.models;

public class NewTokenRequest {
    public String appCode;
    public String mobUrl;
    public NewTokenDataRequest data;

    public NewTokenRequest(String appCode, String mobUrl, NewTokenDataRequest data) {
        this.appCode = appCode;
        this.mobUrl = mobUrl;
        this.data = data;
    }
}
