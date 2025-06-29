package com.puneet.ra;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssured2d_PathParam {

    //http://localhost:8080/student/2
    public static void main(String[] args) {

        Response response =
                given().
                        pathParam("id", 10)
                .when()
                        .get("http://localhost:8080/student/{id}");

        response.prettyPrint();
    }
}
