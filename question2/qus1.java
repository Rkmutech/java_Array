package question2;

import java.util.Scanner;

public class qus1 {
    public static void Arrays(int n,int k)

    {
            int[] arr=new int[n];   
            for(int i=0;i<n;i++)
            {
                arr[i]=k;
                System.out.print(arr[i]+" ");
            } 
           /*  for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }*/
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your n input:");
         int n=sc.nextInt();
         System.out.println("Enter the your k input:");
         int k=sc.nextInt();
        Arrays(n,k);
        
    }
    
}
