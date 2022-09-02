package question_16;

import java.util.Scanner;

public class qus_16 {
    public static void odd_postion_sum(int arr[])
    {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<=n;i++)
        {
           if(arr[i]%2==1)
           {
               sum+=arr[i];
           }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the n element:");
        //int n=sc.nextInt();
        /*int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element:");
            arr[i]=sc.nextInt();
        }*/
        int[] arr={24,78,89,78,45,78,26,56,68};

        odd_postion_sum(arr);
    }
    
}
