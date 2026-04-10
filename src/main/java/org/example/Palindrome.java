package org.example;

public class Palindrome {
    //Palindrome obj=new Palindrome();
    public static void main(String args[]) {
        Palindrome obj=new Palindrome();
        System.out.println(obj.isPalindrome("abc"));
    }
    //abccba
    public  boolean isPalindrome(String s)
    {

//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)!=s.charAt(s.length()-(i+1)))
//            {
//                return false;
//            }
//
//        }
//
//            return true;

       return  new StringBuilder(s).reverse().toString().equals(s);
    }
}
