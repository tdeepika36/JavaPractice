package org.example;

public class Interface {
    public static void main(String args[]){

        Price obj2=new Price(5000);
        obj2.getColor("red");
        obj2.getPrice();

    }
}
interface Cars{
    void getPrice();
    default void getColor(String color){
        if(color.equals("black"))
        {
            System.out.println("color of car is black");
        }
        else
            System.out.println("color of car is not black");
    }
}
class Price implements Cars{
    private int p;
    Price(int p){
        this.p=p;
    }
    public void getPrice(){
        System.out.println(p);
    }
}
