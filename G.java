package com.gyan;

import java.util.stream.Stream;

public class G
{
    public static void main(String[] args) {
        Stream.of("Gyan","Ram","Nalini","Gaurav")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
