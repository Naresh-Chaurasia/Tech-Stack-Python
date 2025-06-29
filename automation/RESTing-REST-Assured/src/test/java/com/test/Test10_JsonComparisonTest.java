package com.test;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

public class Test10_JsonComparisonTest {

    @Test
    public void testJsonEquality() {
        String expectedJsonString = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";
        String actualJsonString = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";

        // Convert the strings to JSONObject
        JSONObject expectedJson = new JSONObject(expectedJsonString);
        JSONObject actualJson = new JSONObject(actualJsonString);

        // Compare the JSON objects
        assertEquals("The JSON objects are not equal!", expectedJson.toString(), actualJson.toString());
    }

    @Test
    public void testJsonInequality() {
        String expectedJsonString = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";
        String actualJsonString = "{ \"name\": \"Jane\", \"age\": 25, \"city\": \"Los Angeles\" }";

        // Convert the strings to JSONObject
        JSONObject expectedJson = new JSONObject(expectedJsonString);
        JSONObject actualJson = new JSONObject(actualJsonString);

        // This will fail because the JSON objects are not the same
        assertEquals("The JSON objects are not equal!", expectedJson.toString(), actualJson.toString());
    }
}

