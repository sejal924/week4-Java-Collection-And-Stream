package org.example.set.checking_set_equal;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTwoSetsAreEqual {
    public static boolean isEqual(Set<Integer> set1, Set<Integer> set2){
        if(set1.size()!=set2.size()){
            return false;
        }
        for(int ele:set1){
            if(!set2.contains(ele)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        System.out.println("First set  : " +set1);
        System.out.println("Second set : " +set2);
        boolean equal=isEqual(set1,set2);
        System.out.println("Equal or not : " + equal);
    }
}
