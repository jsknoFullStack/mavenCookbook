package com.maven.jskno;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    private static final List<String> TELEWORK_DAYS = Arrays.asList("Thursday", "Friday");
    public static void main(String[] args) {
        System.out.println("Hello World!");

        TELEWORK_DAYS.forEach(System.out::println);
    }
}
