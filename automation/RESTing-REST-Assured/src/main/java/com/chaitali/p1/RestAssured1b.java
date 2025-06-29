package com.chaitali.p1;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class RestAssured1b {
    public static void main(String[] args) {
        // Perform a GET request to fetch users
                given()
                .when()
                    .get("https://jsonplaceholder.typicode.com/users")
                .then()
                    .statusCode(200); // Assert that status code is 200 (OK)



    }
}
