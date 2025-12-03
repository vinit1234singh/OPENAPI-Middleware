package com.gateway.openapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.gateway.openapi.model.RequestData;

@Service
public class SchemaValidation {

    /**
     * @return
     */
    public boolean schemaValidate(@RequestBody RequestData requestData){


        
        return false;
    }

    public boolean tokenValidation(String apiToken){
        if(apiToken == null || apiToken.isEmpty() || apiToken.equals("")){
            return false;
        }
        
        return true;
    }
    
}
