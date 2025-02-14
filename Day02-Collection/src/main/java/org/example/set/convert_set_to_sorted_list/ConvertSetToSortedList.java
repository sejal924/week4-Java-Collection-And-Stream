package org.example.set.convert_set_to_sorted_list;

import java.util.*;

public class ConvertSetToSortedList {

    public static List<Integer> sortedList(Set<Integer> set){
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        System.out.println("Set  : " +set);
        List<Integer> list=sortedList(set);
        System.out.println("Sorted list : " + list );
    }
}
