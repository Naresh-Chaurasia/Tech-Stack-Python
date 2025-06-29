package com.resting.videogame;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class VideoGames2_ResSpec extends TestConfig_Spec_Resp {

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
