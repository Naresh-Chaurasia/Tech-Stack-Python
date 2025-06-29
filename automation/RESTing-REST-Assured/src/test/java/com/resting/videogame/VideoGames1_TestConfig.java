package com.resting.videogame;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGames1_TestConfig extends TestConfig{


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
