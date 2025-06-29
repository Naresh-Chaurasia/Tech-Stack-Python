package com.resting.videogame;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.BeforeClass;

public class TestConfig_Spec_Resp {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://localhost/";
        RestAssured.basePath = "app";
        RestAssured.port = 8080;

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType("application/json")
                .addHeader("Accept", "application/xml")
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }
}