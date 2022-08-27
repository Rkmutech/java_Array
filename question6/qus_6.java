package question6;

import java.util.Scanner;

public class qus_6 {
    public static void reverse(int arr[])
    {
        int length=arr.length;
        for(int i=length-1;i>=0;i-- )
        {
            System.out.println("The element"+" "+i+" "+"is"+" "+arr[i]);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your input:");
        int n=sc.nextInt();
        int[] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the your element:");
             arr[i]=sc.nextInt();
        }
        reverse(arr);
        
    }
    
}
