package com.codepet.test;

import com.codepet.data.FeedbackJSONData;
import com.codepet.data.UtilData;
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

    @Test(description = "тест с валидными минимальными значениями")
    public void postJsonWithMinValidValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomMinValueValidJsonData());

        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test(description = "тест с валидными максимальными значениями")
    public void postJsonWithMaxValidValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomMaxValueValidJsonData());

        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test(groups = "${name}", description = "тест с не валидным значения имя латиницей")
    public void randomValueWithLatinNameTextJsonData() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithLatinNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEnterCyrillicName());
    }

    @Test(groups = "${name}", description = "тест с пустым значением в имени")
    public void postJsonWithEmptyNameValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithEmptyNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEmptyField());
    }

    @Test(groups = "${name}", description = "тест с одним символом в имени")
    public void postJsonWithHyphenNameValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithHyphenNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getNameLength());
    }

    @Test(groups = "${name}", description = "тест с числом в имени")
    public void postJsonWithIntNameValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithIntNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEnterCyrillicName());
    }

    @Test(groups = "${name}", description = "тест с числом в виде строки в имени")
    public void postJsonWithStringIntNameValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithStringIntNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEnterCyrillicName());
    }

    @Test(groups = "${name}", description = "тест с двумя '--' в  имени")
    public void postJsonWithDoubleHyphenNameValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomValueWithDoubleHyphenNameTextJsonData());

        Assert.assertEquals(response.getStatusCode(), 201);
    }

    @Test(groups = "${phone}", description = "тест без префикса + в телефоне")
    public void postJsonWithInvalidPhoneNumberValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomMinValuePhoneNumberWithoutPrefixJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectPhoneNumber());
    }

    @Test(groups = "${email}", description = "тест емэйла с первым символом в виде точки")
    public void postJsonWithStartDotEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomEmailNameWithDotStartJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с последним символом в виде точки")
    public void postJsonWithEndDotEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomEmailNameWithDotEndJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с последним символом в виде дефиза")
    public void postJsonWithEndDashEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomEmailNameWithDashStartJsonData());

        Assert.assertEquals(response.getStatusCode(), 201);
//        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с первым символом в виде дефиза")
    public void postJsonWithStartDashEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.randomEmailNameWithDashEndJsonData());

        Assert.assertEquals(response.getStatusCode(), 201);
//        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с пустым полем")
    public void postJsonWithEmptyEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.emptyEmailValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEmptyEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с выше максимальным значением")
    public void postJsonWithOverMaxEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.overMaxEmailValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getOverMaxEmailAddress());
    }

    @Test(groups = "${email}", description = "тест емэйла с ниже минимальным значением")
    public void postJsonWithOverMinEmailValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.overMinEmailValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getIncorrectEmailAddress());
    }

    @Test(groups = "${text}", description = "тест поля текст с ниже минимальным значением")
    public void postJsonWithOverMinTextValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.overMinTextValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getOverMinTextValue());
    }

    @Test(groups = "${text}", description = "тест поля текст с выше максимальным значением")
    public void postJsonWithOverMaxTextValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.overMaxTextValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getOverMaxTextValue());
    }

    @Test(groups = "${text}", description = "тест поля тект с пустым значением")
    public void postJsonWithEmptyTextValueTest() {
        sendPostRequestWithJson(FeedbackJSONData.emptyTextValueJsonData());

        Assert.assertEquals(response.getStatusCode(), 400);
        Assert.assertEquals(response.asPrettyString(), UtilData.getEmptyTextValue());
    }

}
