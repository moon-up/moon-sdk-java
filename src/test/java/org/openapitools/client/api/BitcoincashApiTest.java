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
import org.openapitools.client.model.BitcoinCashInput;
import org.openapitools.client.model.BitcoinCashTransactionInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BitcoincashApi
 */
@Disabled
public class BitcoincashApiTest {

    private final BitcoincashApi api = new BitcoincashApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBitcoinCashAccountTest() throws ApiException {
        String authorization = null;
        BitcoinCashInput bitcoinCashInput = null;
        AccountControllerResponse response = api.createBitcoinCashAccount(authorization, bitcoinCashInput);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBitcoinCashAccountTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        AccountControllerResponse response = api.getBitcoinCashAccount(authorization, accountName);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBitcoinCashAccountsTest() throws ApiException {
        String authorization = null;
        AccountControllerResponse response = api.listBitcoinCashAccounts(authorization);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void signBitcoinCashTransactionTest() throws ApiException {
        String authorization = null;
        String accountName = null;
        BitcoinCashTransactionInput bitcoinCashTransactionInput = null;
        AccountControllerResponse response = api.signBitcoinCashTransaction(authorization, accountName, bitcoinCashTransactionInput);
        // TODO: test validations
    }

}