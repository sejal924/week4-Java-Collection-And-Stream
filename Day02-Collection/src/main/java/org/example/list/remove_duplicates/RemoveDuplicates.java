package org.example.list.remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removingDuplicates(List<Integer> list){
       List<Integer> temp=new ArrayList<>();
       for(int i=0;i<list.size();i++) {
           int a = list.get(i);
           if (!temp.contains(a)) {
               temp.add(a);
           }
       }
       return temp;
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        System.out.println("List with duplicates : " + list);
        list=removingDuplicates(list);
        System.out.println("List without duplicates : " + list);
    }
}
