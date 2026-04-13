package org.example;
import org.example.Duplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicatesTest{
    Duplicates obj=new Duplicates();

    @Test
    void uniqueArray(){
        int []a={1,2,1,1,4,6,4};
        int[]b=obj.removeDuplicates(a);
        int []res={1,2,4,6};
            assertArrayEquals(res,b);
    }
    @Test
    void removeDup(){
        int []a={3,6,6,9,3,1};
        int[]b=obj.removeDuplicates(a);
        int []res={1,3,6,9};
        assertArrayEquals(res,b);
    }
    }
