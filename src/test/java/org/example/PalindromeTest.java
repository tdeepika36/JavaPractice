package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest{

    Palindrome s=new Palindrome();

    @Test
    void palindromeOrNot() {

        assertEquals(true,s.isPalindrome("abccba"));
    }
    @ParameterizedTest
    @ValueSource(strings={"racecar","radar","civic"})
    void palindromes(String s1) {
        assertTrue(s.isPalindrome(s1));
    }
    @ParameterizedTest
    @ValueSource(strings={"abc","vshdb","bwjhs"})
    void checkPalindrome(String s1) {
        assertFalse(s.isPalindrome(s1));
    }
}