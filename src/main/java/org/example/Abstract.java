package org.example;
//all methods from abstract class should be implemented in each subclass,implementing only one method deoen't compile.

abstract class Area {
    abstract void rectangle();
    //abstract void square();

}
class RectArea extends Area{
    public void rectangle(){
        int a=3,b=4;

        System.out.println("area of rectangle: "+a*b);
    }
}
/*class SquareArea extends Area{
    public void square(){
        int s=3;
        System.out.println("area of square: "+ s*s);
    }
}*/
class Abstract{
    public static void main(String args[]){
       /* SquareArea s=new SquareArea();
        s.square();*/
        RectArea r=new RectArea();
        r.rectangle();
    }
}
