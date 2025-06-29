package com.resting.videogame.assertions;

import com.resting.videogame.TestConfig_Spec_Json_Xml_Json;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class VideoGames3_Assert6 extends TestConfig_Spec_Json_Xml_Json {

    @Test
    public void getVideoGames() {

        // Perform a GET request to fetch users
        given().
                log().all()
        .when()
                .get("/videogames")
        .then()
                // 5. Validate that at least one game has a "PG-13" rating
                .body("rating", hasSize(10));

    }
}
