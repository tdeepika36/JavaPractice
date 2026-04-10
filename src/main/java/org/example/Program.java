package org.example;

import java.util.Scanner;
public class Program {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array" + " ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter numbers" + " ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
        SortArray(arr);
        for(int q=0;q<n;q++) {
            System.out.print(arr[q]+" ");
        }
    }
    public static int[] SortArray(int array []){
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++ )
            {
                if(array[i]<array[j]) //ascending
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
       return array;

        }
    }
