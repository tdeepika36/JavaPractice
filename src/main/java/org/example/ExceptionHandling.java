package org.example;
public class ExceptionHandling {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
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
                         System.out.println(array[i]);
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
    }

}


