package com.codepet.runner;

import io.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    private static final String URL = "https://2260993-dk30711.twc1.net/api/feedback/";

    public String getUrl() {
        return URL;
    }

    @BeforeMethod
    protected void beforeMethod() {
        RestAssured.baseURI = URL;
        RestAssured.reset();
        System.out.println("Start API test" + getClass());
    }

    @AfterMethod
    protected void afterMethod() {

        System.out.println("All test done");
    }

}
