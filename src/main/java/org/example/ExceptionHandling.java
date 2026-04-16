package org.example;


import java.util.Scanner;

public class ExceptionHandling {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
    }
    public static void validateScore(int score) throws Exception {
        if(score<0 || score>100)
        {
            throw new Exception("Invalid score");
        }
    }
    public static void main(String args[]) {
             int a=10,b=0;
             int []array =new int[5];

             try{
                 System.out.println(a/b);
             }
             catch(ArithmeticException e) {
                 System.out.println("Cannot divide by zero");
             }
             try {
                     for (int i = 0; i < 9; i++){
                         System.out.println(array[i]=i);
                     }
                 }
             catch(ArrayIndexOutOfBoundsException aie){
                     System.out.println("check array size and input");
                 }

             try{
                 validateAge(15);
             }
             catch (IllegalArgumentException e) {
                 System.out.println("Validation failed: " + e.getMessage());
             }
        try{
            validateScore(123);
        }
        catch(Exception exe){
            System.out.println(exe.getMessage());
        }
        finally {
            System.out.println("will execute");
        }
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter name");
            String s=sc.nextLine();
            System.out.println(s);
        }
        catch(Exception ey){
            System.out.println("Scanner is automatically closed after try block,no need to close resource in finally block");
        }
    }

    }




