package com.resting.videogame.assertions;

import com.resting.videogame.TestConfig_Spec_Json_Xml_Json;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VideoGames3_Assert2 extends TestConfig_Spec_Json_Xml_Json {

    @Test
    public void getVideoGames() {

        // Perform a GET request to fetch users
        given().
                log().all()
        .when()
                .get("/videogames")
        .then().
                log()
                .all()
                .body("[0].name", equalTo("Resident Evil 3"));

    }
}
