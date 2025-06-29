package com.jsoning;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON4 {
    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File jsonFile = new File(Paths.JSON_PATH+"file1.json");

            // Parse the file and extract the title of the first book
            // Extract all book titles
            // Extract the price of the pen
            // Extract books with price greater than 10
            List expensiveBooks = JsonPath.parse(jsonFile).read("$.store.book[?(@.price > 10)]");

            System.out.println("Expensive Books: " + expensiveBooks);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
