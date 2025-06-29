package com.jsoning;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON3 {
    public static void main(String[] args) {
        try {
            // Read JSON from a file
            File jsonFile = new File(Paths.JSON_PATH+"file1.json");

            // Parse the file and extract the title of the first book
            // Extract all book titles
            // Extract the price of the pen
            double penPrice = JsonPath.parse(jsonFile).read("$.store.stationery.price");

            System.out.println("Pen Price: " + penPrice);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
