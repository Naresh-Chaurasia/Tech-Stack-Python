package com.test;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestJunit {


    @Test
    public void testStringMatchers() {
        String text = "Hello Hamcrest";

        // Check if string contains a specific substring
        assertThat(text, containsString("Hamcrest"));

        // Check if string starts with a specific prefix
        assertThat(text, startsWith("Hello"));

        // Check if string ends with a specific suffix
        assertThat(text, endsWith("Hamcrest"));

        // Check if string matches exactly
        assertThat(text, equalTo("Hello Hamcrest"));

        // Check if string matches ignoring case
        assertThat(text, equalToIgnoringCase("hello hamcrest"));
    }

    @Test
    public void testListMatchers() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        // Check if list has a specific size
        assertThat(fruits, hasSize(3));

        // Check if list contains certain items in any order
        assertThat(fruits, containsInAnyOrder("Banana", "Apple", "Orange"));

        // Check if list contains a specific item
        assertThat(fruits, hasItem("Apple"));

        // Check if list does not contain a specific item
        assertThat(fruits, not(hasItem("Grape")));


    }

    @Test
    public void testNumberMatchers() {
        int num = 42;

        // Check if the number is greater than a value
        assertThat(num, greaterThan(40));

        // Check if the number is less than or equal to a value
        assertThat(num, lessThanOrEqualTo(50));

        // Check if the number is between two values
        assertThat(num, allOf(greaterThan(30), lessThan(50)));
    }

    @Test
    public void testBooleanMatchers() {
        boolean value = true;

        // Check if the value is true
        assertThat(value, is(true));

        // Check if the value is false
        assertThat(value, not(false));
    }

    @Test
    public void testArrayMatchers() {
        String[] colors = {"Red", "Green", "Blue"};

        // Check if the array has a specific item
        assertThat(colors, hasItemInArray("Green"));

        // Check if the array has specific items in any order
        assertThat(colors, arrayContainingInAnyOrder("Blue", "Green", "Red"));
    }

    @Test
    public void testEmptyMatchers() {
        List<String> emptyList = Arrays.asList();

        // Check if the list is empty
        assertThat(emptyList, is(empty()));

        // Check if the list is not empty
        List<String> nonEmptyList = Arrays.asList("One");
        assertThat(nonEmptyList, not(empty()));
    }

    @Test
    public void testNullMatchers() {
        Object obj = null;

        // Check if the object is null
        assertThat(obj, is(nullValue()));

        // Check if the object is not null
        obj = new Object();
        assertThat(obj, is(notNullValue()));
    }

    @Test
    public void testCombiningMatchers() {
        String name = "Hamcrest Example";

        // Check if string both starts and ends with certain words
        assertThat(name, allOf(startsWith("Hamcrest"), endsWith("Example")));
    }

    @Test
    public void testComparativeMatchers() {
        List<Integer> numbers = Arrays.asList(5, 10, 15);

        // Check if every number is less than a value
        assertThat(numbers, everyItem(lessThan(20)));

        // Check if the list has an item greater than a specific value
        assertThat(numbers, hasItem(greaterThan(8)));
    }

    @Test
    public void testStringContentMatchers() {
        String text = "Welcome to Hamcrest";

        // Check if string has a specific word
        assertThat(text, containsString("Hamcrest"));

        // Check if string has a specific sequence ignoring case
        assertThat(text, containsStringIgnoringCase("welcome"));
    }
}
