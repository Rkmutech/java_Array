package question_18;

public class qus_18 {
    public static int mean(int arr[])
    {
        int mean=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            mean+=arr[i];

        }
        return mean;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,8,9,56,68,56};
       int print= mean(arr);
       System.out.println(print);
        
    }
    
}
