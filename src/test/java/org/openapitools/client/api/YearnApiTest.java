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
import org.openapitools.client.model.InputBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for YearnApi
 */
@Disabled
public class YearnApiTest {

    private final YearnApi api = new YearnApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addLiquidityTest() throws ApiException {
        String authorization = null;
        String name = null;
        InputBody inputBody = null;
        AccountControllerResponse response = api.addLiquidity(authorization, name, inputBody);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addLiquidityWethTest() throws ApiException {
        String authorization = null;
        String name = null;
        InputBody inputBody = null;
        AccountControllerResponse response = api.addLiquidityWeth(authorization, name, inputBody);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLiquidityTest() throws ApiException {
        String authorization = null;
        String name = null;
        InputBody inputBody = null;
        AccountControllerResponse response = api.removeLiquidity(authorization, name, inputBody);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeLiquidityWethTest() throws ApiException {
        String authorization = null;
        String name = null;
        InputBody inputBody = null;
        AccountControllerResponse response = api.removeLiquidityWeth(authorization, name, inputBody);
        // TODO: test validations
    }

}
