package com.jsoning;

import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSON5 {
    public static void main(String[] args)
        {


            try{
                // Read JSON from a file
                File json = new File(Paths.JSON_PATH+"file1.json");


                // Get the count of books
                int bookCount = JsonPath.parse(json).read("$.store.book.length()");
                System.out.println("Number of Books: " + bookCount);

            }catch (Exception e){
                System.out.println(e);
            }



        }
}
