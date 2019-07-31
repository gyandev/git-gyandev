package com.gyan;

import java.util.ArrayList;
import java.util.stream.Stream;

public class E
{
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        System.out.println(marks);
        System.out.println("----No of Failed Students---");
        Long noOfFailed=marks.stream().filter((i1->i1<35)).count();
        System.out.println(noOfFailed);
        System.out.println("---Convert Stream to Array---");
        Integer [] array=marks.stream().toArray(Integer[]::new);
        Stream.of(array).forEach(System.out::println);
        System.out.println("---Count---");
        System.out.println(Stream.of(array).count());

    }
}
