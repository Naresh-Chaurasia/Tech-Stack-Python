package com.puneet.ra;

import static io.restassured.RestAssured.given;

public class RestAssured1b {
    public static void main(String[] args) {
        // Perform a GET request to fetch users
                given()
                        .log().
                        ifValidationFails()
                .when()
                    .get("https://jsonplaceholder.typicode.com/users")
                .then()
                    .statusCode(201); // Assert that status code is 200 (OK)

    }
}
