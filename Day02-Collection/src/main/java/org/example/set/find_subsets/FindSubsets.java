package org.example.set.find_subsets;

import java.util.HashSet;
import java.util.Set;

public class FindSubsets {
    public static boolean isSubSet(Set<Integer> set1,Set<Integer> set2){
        if(set1.size()<set2.size()){
            for(int e:set1){
                if(!set2.contains(e)){
                    return false;
                }
            }
            return true;
        }else{
            for(int e:set2){
                if(!set1.contains(e)){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        boolean areSubSet=isSubSet(set1,set2);
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("Is one set is a subset of another : " + areSubSet);
    }
}
