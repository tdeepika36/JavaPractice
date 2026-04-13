package org.example;

import java.util.Arrays;

public class Duplicates{

    public int[] removeDuplicates(int []array){
        int [] newArray=new int[array.length];
        int j=0;
        Arrays.sort(array);
        for(int i=0;i<array.length-1;i++)
        {
                if(array[i]!=array[i+1])
                {
                    newArray[j++]=array[i];

                }

        }
        newArray[j++]=array[array.length-1];
        int[] result=new int[j];
        for(int k=0;k<result.length;k++)
        {
            result[k]=newArray[k];
        }

        return result;
    }

}