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
import org.usemoonai.moonsdk.models.EnsResolveAPIResponse;
import org.usemoonai.moonsdk.models.EnsResolveInput;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnsApi
 */
@Disabled
public class EnsApiTest {

    private final EnsApi api = new EnsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resolveTest() throws ApiException {
        String authorization = null;
        EnsResolveInput ensResolveInput = null;
        EnsResolveAPIResponse response = api.resolve(authorization, ensResolveInput);
        // TODO: test validations
    }

}
