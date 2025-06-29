package com.resting.videogame;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import io.restassured.builder.RequestSpecBuilder;

public class TestConfig_Spec_Json_Xml_Json {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://localhost/";
        RestAssured.basePath = "app";
        RestAssured.port = 8080;

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType("application/json")
                .addHeader("Accept", "application/json")
                .build();
    }
}