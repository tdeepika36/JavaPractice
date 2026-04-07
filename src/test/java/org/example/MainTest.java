package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void SortingNums() {
        Program obj=new Program();
        int[] Array={6,5,4,3,2,1};
        int[] expectedArray = {1,2,3,4,5,6};
        int[] actualArray  = obj.SortArray(Array);
        assertArrayEquals(expectedArray, actualArray);

    }
}