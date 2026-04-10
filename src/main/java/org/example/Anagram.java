package org.example;

import java.util.Scanner;

public class Anagram{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string ");
        String input1 = s.nextLine();
        System.out.println("Enter second string ");
        String input2 = s.nextLine();
        if(CheckAnagram(input1,input2))
             System.out.println("Is Anagram");
        else
            System.out.println("Is NOT an Anagram");

    }
    final static int RANGE=256;

    static boolean CheckAnagram(String str1,String str2 ){

            if (str1.length() != str2.length()) {
                return false;
            }
            int count[] = new int[RANGE];
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i)]++;
                count[str2.charAt(i)]--;
            }
            for (int i = 0; i < RANGE; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
            return true;
        }

}



