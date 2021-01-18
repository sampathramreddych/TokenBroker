package com.tokenbroker.broker.logic;

import com.tokenbroker.broker.controller.model.CosmosHeaders;

public interface MasterTokenService {
    
    public CosmosHeaders generateReadAllToken(String role);

    public CosmosHeaders generateMasterKeyToken(
        String verb, 
        String resourceType, 
        String resourceId, 
        String date, 
        String key,
        String keyType,
        String tokenVersion,
        String role);

}