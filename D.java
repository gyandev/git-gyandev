package com.gyan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class D
{
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ram");
        al.add("Gyandev");
        al.add("Nalini");
        al.add("Jyothi");
        al.add("Rahul");
        al.add("Upmanyu J");
        al.add("Huge Jackman");
        System.out.println(al);
        List<String> list=al.stream().sorted((s1,s2)->
        {
            int i=s1.length();
            int i1=s2.length();
            if (i<i1) return -1;
            else if(i>i1) return +1;
            else return s1.compareTo(s2);
        }).collect(Collectors.toList());
        System.out.println("--Sorted According to Increasing Order of Length---");
        System.out.println(list);
    }
}
