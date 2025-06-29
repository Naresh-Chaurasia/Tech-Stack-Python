package com.resting.videogame.assertions;

import com.resting.videogame.TestConfig_Spec_Json_Xml_Json;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class VideoGames3_Assert11 {



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
                                .body("size()",equalTo(10));

    }

    @Test
    public void getVideoGames2() {

    }

    @Test
    public void getVideoGames3() {

    }

    @Test
    public void getVideoGames4() {

    }
}
