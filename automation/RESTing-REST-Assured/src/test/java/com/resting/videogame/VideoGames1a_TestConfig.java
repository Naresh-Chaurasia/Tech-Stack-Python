package com.resting.videogame;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGames1a_TestConfig {

    @BeforeClass
    public static void setup() {
        RestAssured.baseURI = "http://localhost/";
        RestAssured.basePath = "app";
        RestAssured.port = 8080;
    }

    @Test
    public void getVideoGames() {

        // Perform a GET request to fetch users
        given().
                log().all()
        .when()
                .get("/videogames")
        .then().
                log().all();

    }
}
