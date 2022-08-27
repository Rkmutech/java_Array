package question_3;

import java.util.Scanner;

public class question2 {
    public static void userinput()
    {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the input n:");
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        System.out.println("Enter the input elements:");
         arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        userinput();
        
    }
    
}
