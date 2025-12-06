package com.gateway.openapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIList {
    private String destUrl;
    private String apiToken;
    private String connectionTimeOut;

    public String getDestUrl() {
        return destUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }

    public String getConnectionTimeOut() {
        return connectionTimeOut;
    }

    public void setConnectionTimeOut(String connectionTimeOut) {
        this.connectionTimeOut = connectionTimeOut;
    }

    public void setDestUrl(String destUrl) {
        this.destUrl = destUrl;
    }

   
    
    
}
