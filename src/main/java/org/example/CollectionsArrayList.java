package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsArrayList {
    public static void main(String[] args){

 ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);
        System.out.println(numbers);
        System.out.println(numbers.set(4,45));
        System.out.println(numbers.get(4));
        System.out.println(numbers.contains(8));
        System.out.println(numbers.indexOf(7));
        System.out.println(numbers.remove(2));
        System.out.println(numbers.size());
        System.out.println(numbers.subList(2,5));
        Iterator<Integer> num=numbers.iterator();
        while(num.hasNext()){
            System.out.println(num.next());
        }
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 45);
           System.out.println("index: "+index);
           Collections.sort(numbers,Collections.reverseOrder());
           System.out.println(numbers);

    }
}