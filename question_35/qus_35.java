package question_35;

import java.util.Scanner;

public class qus_35 {
    public static void perfect_squre(int arr[],int n)
    {
        double[] squre1=new double[n];
       // double[] arr=new double[n];
        double squre=0;
        for(int i=0;i<n;i++)
        {
           //Double a=[i];
           squre =Math.pow(arr[i],arr[i]);
          squre1[i]=squre;
          System.out.println(squre1[i]);
        }
 
    }
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        perfect_squre(arr,n);
    }
    
}
