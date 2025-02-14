package org.example.set.union_and_intersection_of_two_sets;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfTwoSets {
    public static Set<Integer> findingUnion(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> temp=new HashSet<>();
        temp.addAll(set1);
        temp.addAll(set2);
        return temp;
    }

    public static Set<Integer> findingIntersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> temp=new HashSet<>();
        for(int e: set1){
            if(set2.contains(e)){
                temp.add(e);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("First set    : " +set1);
        System.out.println("Second set   : " +set2);

        Set<Integer> union=findingUnion(set1,set2);
        Set<Integer> intersection=findingIntersection(set1,set2);

        System.out.println("Union        : " + union);
        System.out.println("intersection : " + intersection);
    }
}
