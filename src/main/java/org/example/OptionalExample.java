package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> hello = java.util.Optional.ofNullable(null);
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());
        hello.map(String::toUpperCase).ifPresent(System.out::println);
        hello.ifPresentOrElse(System.out::println,()-> System.out.println("ahamed"));
    }

}
