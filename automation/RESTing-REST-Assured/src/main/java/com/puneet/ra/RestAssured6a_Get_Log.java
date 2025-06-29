package com.puneet.ra;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssured6a_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        Response response =
                given().
                    log().all()
                .when()
                    .get("http://localhost:8080/student/list");

    }
}
