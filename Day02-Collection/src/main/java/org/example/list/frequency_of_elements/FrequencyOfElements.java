package org.example.list.frequency_of_elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {

    public static Map<String, Integer> countFrequency(List<String> list){
        Map<String, Integer> map=new HashMap<>();
        for(String s:list){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");

        System.out.println("List : " + list);
        Map<String ,Integer> map=countFrequency(list);
        System.out.println("Frequency of elements :" +map);
    }
}
