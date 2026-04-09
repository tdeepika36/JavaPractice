package org.example;
//method overloading
public class Calculator {

    public static void main(String args[])
    {
        Calculator cal=new Calculator();
        cal.sumNum(3,5);
        int difference=cal.differenceNum(7,2);
        System.out.println(difference);
        cal.sumNum(3.0,44,2.0);
        cal.sumNum(3,3.0,3);
    }
    public void sumNum(int a,int b){
        System.out.println(a+b);
    }
    public int differenceNum(int a,int b) {
        return a - b;
    }
    public void sumNum(double a,int b,double c)
    {
        System.out.println(a+b+c);
    }
    public void sumNum(int a,double b,int c){
        System.out.println(a+b+c);
    }

}

