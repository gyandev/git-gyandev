package com.gyan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B
{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(12);
        al.add(11);
        al.add(19);
        al.add(19);
        al.add(17);
        al.add(13);
        System.out.println(al);
        List<Integer> list=al.stream().sorted().collect(Collectors.toList());
        List<Integer> list1=al.stream().distinct().collect(Collectors.toList());
        List<Integer> list2=al.stream().sorted((I1,I2)->I1.compareTo(I2)).collect(Collectors.toList());
        Integer max =al.stream().max((I1,I2)->I1.compareTo(I2)).get();
        Integer min=al.stream().min((I1,I2)->I1.compareTo(I2)).get();
        System.out.println("---Natural sorting----");
        System.out.println(list);
        System.out.println("-----distinct ----");
        System.out.println(list1);
        System.out.println("----Natural Sorted-----");
        System.out.println(list2);
        System.out.println("----max element");
        System.out.println(max);
        System.out.println("-----min element----");
        System.out.println(min);



    }
}
