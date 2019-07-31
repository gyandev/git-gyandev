package com.gyan;

import java.util.stream.IntStream;

public class F
{
    public static void main(String[] args) {
        System.out.println("--Print 1 to 9 --");
        IntStream
                .range(1,10)
                .forEach(System.out::println);

        System.out.println("----Integer with Skip---");
        IntStream
                .range(1,10)
                .skip(4)
                .forEach(System.out::println);
        System.out.println("----sum of 1 to 9--");

        System.out.println(IntStream
                .range(1,10)
                .sum());
    }

}
