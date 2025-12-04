package com.gateway.openapi.Repo;

import com.gateway.openapi.model.APIList;

public interface ApiRespository {
    public APIList getAPIdetails(String apiToken);
}


