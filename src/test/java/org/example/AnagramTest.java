package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void IsAnagram() {
        Anagram obj=new Anagram();
       String s1="l*isten#3";
       String s2="*sil#e3nt";

        boolean expected=true;
        boolean actual=obj.CheckAnagram(s1,s2);
        assertEquals(expected,actual);
    }
    @Test
    void NotAnagram(){
        Anagram sc=new Anagram();
        String s1="cdhwqo";
        String s2="^@nndk";

        boolean expected=false;
        boolean actual=sc.CheckAnagram(s1,s2);
        assertEquals(expected,actual);
    }

}