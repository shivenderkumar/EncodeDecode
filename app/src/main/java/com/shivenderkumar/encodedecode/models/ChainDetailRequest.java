package com.shivenderkumar.encodedecode.models;

public class ChainDetailRequest {
    public String tId;
    public ChainDetailDataRequest data;

    public ChainDetailRequest(String tId, ChainDetailDataRequest data) {
        this.tId = tId;
        this.data = data;
    }

//    {tId='f3005f83-140b-4926-ae04-9f02b1649e76',data={chainId='165', mobUrl='pockets309lake'}}
//    {"tId":"eb5081ab-9875-4a4d-ac7d-c42d65106c5a","data":{"chainId":165,"mobUrl":"pockets309lake"}}

    @Override
    public String toString() {
        return "{\"tId\":\""+tId+"\",\"data\":"+data+"}";
    }
}


