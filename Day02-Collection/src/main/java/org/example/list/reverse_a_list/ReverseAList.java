package org.example.list.reverse_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReverseAList {
    public static void reversingList(List<Integer> list){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int temp=list.get(start);
            int lastEle=list.get(end);
            list.set(start,lastEle);
            list.set(end,temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("List before reverse :" + arrayList);
        reversingList(arrayList);
        System.out.println("List after reverse  :" + arrayList);

        List<Integer> linkList=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("List before reverse :" + linkList);
        reversingList(linkList);
        System.out.println("List after reverse  :" + linkList);
    }
}
