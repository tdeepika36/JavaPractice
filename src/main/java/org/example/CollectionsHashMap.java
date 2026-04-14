package org.example;

import java.util.HashMap;

public class CollectionsHashMap{

    public static void main(String args[]){
        HashMap<String,Integer> hash=new HashMap<String,Integer>();
        hash.put("India",1);
        hash.put("USA",2);
        hash.put("UK",5);
        hash.put("Australia",3);
        hash.put("USA",4);
        System.out.println(hash);
        for (String i : hash.keySet()) {
            System.out.println(i);
        }
        for (int i : hash.values()) {
            System.out.println(i);
        }
        System.out.println(hash.containsKey("canada"));
        System.out.println(hash.containsValue(5));



    }
        }