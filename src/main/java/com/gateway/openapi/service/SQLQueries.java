package com.gateway.openapi.service;

public class SQLQueries {
    public static final String GET_DEST_URL =
        "SELECT DEST_URL FROM API_CLIENT_CONFIG WHERE API_TOKEN = ? limit=1";
}

