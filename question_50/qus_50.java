package question_50;

public class qus_50 {
    public static int first_largest(int arr[])
    {
        int big=arr[0],big_2=big-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>big)
            {
               big=arr[i]; 
            }
            return big;

    }
    public static int second_larest(int arr[])
    {
        int big_2-1=first_largest(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=big_2 )
            {
              big_2=arr[i];
            }
        }
            
        }
       // System.out.println(big_2);
        return big_2 ;
    }
    public static void main(String[] args) {
        int[] arr={12,45,89,90,45,56};
        int print=second_larest(arr);
        System.out.println(print);
        
    }
    
}
