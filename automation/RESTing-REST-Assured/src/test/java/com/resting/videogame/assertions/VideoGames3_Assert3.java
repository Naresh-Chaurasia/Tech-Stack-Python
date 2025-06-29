package com.resting.videogame.assertions;

import com.resting.videogame.TestConfig_Spec_Json_Xml_Json;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.util.*;

public class VideoGames3_Assert3 extends TestConfig_Spec_Json_Xml_Json {

    @Test
    public void getVideoGames() {

        List<String> expectedItems = new ArrayList<>();
        expectedItems.add("Driving");
        expectedItems.add("Shooter");


        String s [] = {"Driving","Driving1"};

        // Perform a GET request to fetch users
        given().
                log().all()
        .when()
                .get("/videogames")
        .then()
                // 5. Validate that at least one game has a "PG-13" rating
                .body("rating", hasItems("PG-13","Universal1"))
                // 6. Validate that no game has a review score below 75
                .body("reviewScore", everyItem(greaterThanOrEqualTo(75)));

    }
}
