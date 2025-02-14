package org.example.set.symmetric_difference;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    public static Set<Integer> findingSymmetricDifference(Set<Integer> set1, Set<Integer> set2){
      Set<Integer> temp=new HashSet<>();

      for(int e:set1) {
          if (!set2.contains(e)) {
              temp.add(e);
          }
      }
      for(int e:set2) {
          if (!set1.contains(e)) {
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

        System.out.println("First set  : " +set1);
        System.out.println("Second set : " +set2);

        Set<Integer> difference=findingSymmetricDifference(set1,set2);
        System.out.println("Symmetric Difference : " + difference);
    }
}
