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
import org.usemoonai.moonsdk.models.EosAPIResponse;
import org.usemoonai.moonsdk.models.EosInput;
import org.usemoonai.moonsdk.models.EosTransactionInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EosApi
 */
@Disabled
public class EosApiTest {

    private final EosApi api = new EosApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEosAccountTest() throws ApiException {
        String authorization = null;
        EosInput eosInput = null;
        AccountAPIResponse response = api.createEosAccount(authorization, eosInput);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEosAccountTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        AccountAPIResponse response = api.getEosAccount(authorization, accountName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEosAccountsTest() throws ApiException {
        String authorization = null;
        AccountAPIResponse response = api.listEosAccounts(authorization);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signEosTransactionTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        EosTransactionInput eosTransactionInput = null;
        EosAPIResponse response = api.signEosTransaction(authorization, accountName, eosTransactionInput);
        // TODO: test validations
    }

}
