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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AccountControllerResponse;
import org.openapitools.client.model.LitecoinInput;
import org.openapitools.client.model.LitecoinTransactionInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LitecoinApi
 */
@Disabled
public class LitecoinApiTest {

    private final LitecoinApi api = new LitecoinApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createLitecoinAccountTest() throws ApiException {
        String authorization = null;
        LitecoinInput litecoinInput = null;
        AccountControllerResponse response = api.createLitecoinAccount(authorization, litecoinInput);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLitecoinAccountTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        AccountControllerResponse response = api.getLitecoinAccount(authorization, accountName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listLitecoinAccountsTest() throws ApiException {
        String authorization = null;
        AccountControllerResponse response = api.listLitecoinAccounts(authorization);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signLitecoinTransactionTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        LitecoinTransactionInput litecoinTransactionInput = null;
        AccountControllerResponse response = api.signLitecoinTransaction(authorization, accountName, litecoinTransactionInput);
        // TODO: test validations
    }

}