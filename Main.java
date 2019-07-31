package com.gyan;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<Integer> al =new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(33);
        al.add(40);
        System.out.println(al);
        // filter(Predicate)-boolean value
        List<Integer> l=al.stream().filter(I->I%2==0).collect(Collectors.toList());
        List<Integer> list=al.stream().filter(I->I%2==1).collect(Collectors.toList());
        List<Integer> list1=al.stream().filter(I->I>=35).collect(Collectors.toList());
        System.out.println("---ForEach----");
        Stream.of(al).forEach(System.out::println);
        System.out.println("-----even numbers");
        System.out.println(l);
        System.out.println("----odd-----");
        System.out.println(list);
        System.out.println("------pass marks------");
        System.out.println(list1);

    }
}
