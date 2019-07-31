package com.gyan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A
{
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(20);
        marks.add(30);
        marks.add(40);
        marks.add(50);
        System.out.println(marks);
        // map(function)--takes a function
        List<Integer> l=marks.stream().map(I->I+5).collect(Collectors.toList());
        List<Integer> list=marks.stream().map(I->I*2).collect(Collectors.toList());
        List<Integer> integerList=marks.stream().map(I->I*I).collect(Collectors.toList());
        System.out.println(l);
        System.out.println("-----double---");
        System.out.println(list);
        System.out.println("-----square-----");
        System.out.println(integerList);

    }
}
