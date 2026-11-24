package org.example.e13methodreference;

import java.util.Arrays;
import java.util.List;

public class MainMethodReference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "둘리", "또치");

        // lambda
        list.forEach((name)-> System.out.println(name));

        // method reference
        list.forEach(System.out::println);
    }
}
