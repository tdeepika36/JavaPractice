package org.example;
//8208,371,153
public class Armstrong{
    public static void main(String args[]){

        Armstrong sc=new Armstrong();
        System.out.println(sc.isArmstrong(8208));

    }

    public boolean isArmstrong(int n){
        int length=0;
        int p=n;
        int q=n;
        while(n>0)
        {
            n=n/10;
            length++;
        }
        int sum=0;
        while(p>0){
            int temp=0;
            temp=p%10;
            sum=(int)(sum+Math.pow(temp,length));
            p=p/10;
        }
        if(sum==q)
           return true;
        else
            return false;

    }
}