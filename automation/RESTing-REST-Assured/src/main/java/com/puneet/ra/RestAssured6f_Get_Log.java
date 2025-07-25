package com.puneet.ra;

import static io.restassured.RestAssured.given;

public class RestAssured6f_Get_Log {
    public static void main(String[] args) {

        // Perform a GET request to fetch users
        given().
        when()
            .get("http://localhost:8080/student/list")
        .then()
            .log()
            .headers();

    }
}
