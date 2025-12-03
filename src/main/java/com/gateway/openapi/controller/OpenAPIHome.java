package com.gateway.openapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gateway.openapi.model.RequestData;
import com.gateway.openapi.model.ResponseData;


@RestController
@RequestMapping("/oapi")
public class OpenAPIHome {
    
    @PostMapping("/token")
    public ResponseEntity<ResponseData> withAuthorizationToken(@RequestBody RequestData requestData, @RequestHeader("apiToken") String apiToken) {
        
        
        return (ResponseEntity<ResponseData>) ResponseEntity.ok();
    }
    
}
