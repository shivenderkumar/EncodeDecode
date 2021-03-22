package com.shivenderkumar.encodedecode.models;

import androidx.annotation.NonNull;

public class ResponseGeneral {
    String data;
    String message;
    String serviceName;
    String serviceStatus;

    public ResponseGeneral(String data, String message, String serviceName, String serviceStatus) {
        this.data = data;
        this.message = message;
        this.serviceName = serviceName;
        this.serviceStatus = serviceStatus;
    }

    public String getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    @NonNull
    @Override
    public String toString() {
        return "\nRESPONSE GENERAL : \n data :"+data+"\n message :"+"\n serviceName :"+serviceName+"\n serviceStatus :"+serviceStatus+"\n";
    }
}
