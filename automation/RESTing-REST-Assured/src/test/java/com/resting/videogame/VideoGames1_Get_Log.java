package com.resting.videogame;

import static io.restassured.RestAssured.given;

public class VideoGames1_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        given().
                log().all()
        .when()
                .get("http://localhost:8080/app/videogames")
        .then().
                log().all();

    }
}
