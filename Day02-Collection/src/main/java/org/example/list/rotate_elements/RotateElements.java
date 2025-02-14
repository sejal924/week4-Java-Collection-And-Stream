package org.example.list.rotate_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElements {

    public static void rotatingListByK(List<Integer> list,int k){
        int length=list.size();
        k=k%length;
        int i=0;
        while(i<k){
            int temp=list.getFirst();
            list.add(temp);
            list.removeFirst();
            i++;
        }
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(10,20,30,40,50));
        int k=2;
        System.out.println("ArrayList before rotation : " + list);
        System.out.println("Rotating by : " + k);
        rotatingListByK(list,k);
        System.out.println("ArrayList after rotation  : " + list);
    }
}
