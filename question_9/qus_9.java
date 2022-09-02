package question_9;

import java.util.Scanner;

public class qus_9 {
    public static void print(int arr[],int k)
    {
        int n=arr.length;
        if(k<n)
        {
            for(int i=k;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else if(k>n)
        {
            System.out.println("The elemnt is greater than n so didn't print");
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your input n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the your input :");
             arr[i]=sc.nextInt();
        }
        System.out.println("Enter the kth element:");
        int k=sc.nextInt();
        print(arr,k);
    }
    
}
