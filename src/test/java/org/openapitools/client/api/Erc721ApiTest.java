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
import org.openapitools.client.model.Erc721Request;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Erc721Api
 */
@Disabled
public class Erc721ApiTest {

    private final Erc721Api api = new Erc721Api();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void approveTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.approve(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void balanceOfTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.balanceOf(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApprovedTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.getApproved(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void isApprovedForAllTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.isApprovedForAll(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void nameTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.name(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ownerOfTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.ownerOf(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void safeTransferFromTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.safeTransferFrom(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setApprovalForAllTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.setApprovalForAll(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void symbolTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.symbol(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tokenUriTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.tokenUri(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transferTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.transfer(authorization, name, erc721Request);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void transferFromTest() throws ApiException {
        String authorization = null;
        String name = null;
        Erc721Request erc721Request = null;
        AccountControllerResponse response = api.transferFrom(authorization, name, erc721Request);
        // TODO: test validations
    }

}
