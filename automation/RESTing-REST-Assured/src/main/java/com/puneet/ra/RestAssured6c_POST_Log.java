package com.puneet.ra;

import com.github.javafaker.Faker;
import com.studentapp.model.StudentPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class RestAssured6c_POST_Log {
    public static void main(String[] args) {

        StudentPojo student = new StudentPojo();
        Faker fake = new Faker();

        List<String> courses = new ArrayList<String>();
        courses.add("Java");
        courses.add("C++");

        student.setFirstName(fake.name().firstName());
        student.setLastName(fake.name().lastName());
        student.setEmail(fake.internet().emailAddress());

        student.setProgramme("Computer Science");
        student.setCourses(courses);

        // Sending POST request
        Response response = RestAssured
                .given()
                    .log().
                     body() // Log entire body
                    .header("Content-Type", "application/json")
                    .body(student) // Setting the body
                .when()
                     .post("http://localhost:8080/student")  // API endpoint
                .then()
                    .extract().response();


    }
}
