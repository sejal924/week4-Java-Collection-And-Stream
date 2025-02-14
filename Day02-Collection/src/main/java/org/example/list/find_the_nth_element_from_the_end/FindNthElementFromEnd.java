package org.example.list.find_the_nth_element_from_the_end;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindNthElementFromEnd {

    public static int findingNthElementFromLast(List<Integer> list,int n){

        int first=0;
        int last=n;
        try {
            while (list.get(last) != null) {
                first++;
                last++;
            }
        }catch(Exception e){
            //
        }
        return list.get(first);
    }

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int n=4;
        System.out.println("List : " + list);
        int element=findingNthElementFromLast(list,n);
        System.out.println(n + "th element from last : " + element);
    }
}
