package com.gateway.openapi.service;

import com.gateway.openapi.model.APIList;
import com.gateway.openapi.model.RequestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.gateway.openapi.service.SQLQueries.GET_DEST_URL;

@Service
public class SchemaValidation implements ApiRepository {

    private final DataSource dataSource;

    @Autowired
    public SchemaValidation(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public APIList getAPIdetails(String apiToken) {

        APIList apiList = new APIList();   // ❗ NEVER Autowire a model class

        try (Connection con = dataSource.getConnection();
             PreparedStatement stmt = con.prepareStatement(GET_DEST_URL)) {

            stmt.setString(1, apiToken);     // API_CODE
            stmt.setString(2, "CLIENT1");    // If you want client_code dynamic, change SQL

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    apiList.setDestUrl(rs.getString("DEST_URL"));
                    apiList.setApiToken(apiToken);
                    String timeout = Integer.toString(rs.getInt("CONNECT_TIMEOUT"));
                    apiList.setConnectionTimeOut(timeout);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return apiList;
    }


    public boolean tokenValidation(String apiToken) {
        return apiToken != null && !apiToken.trim().isEmpty();
    }

    public boolean schemaValidate(RequestData requestData) {
        // add your schema validation logic
        return true;
    }
}
