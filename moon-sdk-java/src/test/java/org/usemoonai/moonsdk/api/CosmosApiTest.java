/*
 * moon-vault-api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.usemoonai.moonsdk.api;

import org.usemoonai.moonsdk.client.ApiException;
import org.usemoonai.moonsdk.models.AccountAPIResponse;
import org.usemoonai.moonsdk.models.CosmosAPIResponse;
import org.usemoonai.moonsdk.models.CosmosInput;
import org.usemoonai.moonsdk.models.CosmosTransactionInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CosmosApi
 */
@Disabled
public class CosmosApiTest {

    private final CosmosApi api = new CosmosApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCosmosAccountTest() throws ApiException {
        String authorization = null;
        CosmosInput cosmosInput = null;
        AccountAPIResponse response = api.createCosmosAccount(authorization, cosmosInput);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCosmosAccountTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        AccountAPIResponse response = api.getCosmosAccount(authorization, accountName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCosmosAccountsTest() throws ApiException {
        String authorization = null;
        AccountAPIResponse response = api.listCosmosAccounts(authorization);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signCosmosTransactionTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        CosmosTransactionInput cosmosTransactionInput = null;
        CosmosAPIResponse response = api.signCosmosTransaction(authorization, accountName, cosmosTransactionInput);
        // TODO: test validations
    }

}
