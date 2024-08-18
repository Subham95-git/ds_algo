package com.demo;

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";
        Optional<String> empty = Optional.empty();
        Optional<String> nonEmpty = Optional.of(str[5]);
        System.out.println("Filtered value: " + nonEmpty.filter(data -> data.equals("ABC")));
        System.out.println("Filtered value: " + nonEmpty.filter(data -> data.equals("JAVA OPTIONAL CLASS EXAMPLE")));
        System.out.println("Getting value: " + nonEmpty.get());
        System.out.println("Getting hashcode: " + nonEmpty.hashCode());
        System.out.println("Is value present: " + nonEmpty.isPresent());
        System.out.println("Nullable Optional " + Optional.ofNullable(str[5]));
        System.out.println(nonEmpty.orElse("No value"));
        System.out.println(empty.orElse("No Value"));
    }
}
