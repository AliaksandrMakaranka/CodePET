package com.codepet.test;

import com.codepet.data.FeedbackJSONData;
import com.codepet.runner.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FeedbackTest extends BaseTest {
    Response response = null;
    RequestSpecification request = null;
    private void sendPostRequestWithJson(String json) {
        request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(json);
        response = request.post(getUrl());
        System.out.println(response.asPrettyString());
    }

    @Test()
    public void postJsonWithMinValidValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomMinValueValidJsonData());

        Assert.assertEquals(response.getStatusCode(),201);
    }

    @Test()
    public void postJsonWithMaxValidValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomMaxValueValidJsonData());

        Assert.assertEquals(response.getStatusCode(),201);
    }






}
