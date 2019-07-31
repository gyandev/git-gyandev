package com.gyan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C
{
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("A");
        al.add("X");
        al.add("Z");
        al.add("B");
        al.add("C");
        al.add("U");
        al.add("J");
        System.out.println(al);
        List<String> list=al.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
        List<String> list1=al.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
        List<String> list2=al.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
        System.out.println("---natural Sorting---");
        System.out.println(list1);
        System.out.println("----Reverse of natural Sorting Order--- ");
        System.out.println(list2);

    }
}
