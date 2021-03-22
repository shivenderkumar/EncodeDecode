package com.shivenderkumar.encodedecode.models;

public class ChainDetailDataRequest {
    public int chainId;
    public String mobUrl;

    public ChainDetailDataRequest(int chainId, String mobUrl) {
        this.chainId = chainId;
        this.mobUrl = mobUrl;
    }

//    {"chainId":165,"mobUrl":"pockets309lake"}

    @Override
    public String toString() {
        return "{\"chainId\":"+chainId+",\"mobUrl\":\""+mobUrl+"\"}";
    }
}
