package question_24;

public class qus_24 {
    public static int mean(int arr[])
    {
        int n=arr.length,sum=0;
        int count=0,mean;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            count++;

        }
        return mean=sum/count;
    }
    public static void mean_sum(int arr[])
    {
        int sum=mean(arr);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]-sum);
        }
        //System.out.print(n);

    }

    public static void main(String[] args) {
        int[] arr={1,3,45,78,90,34,56};
        mean_sum(arr);
        
    }
    
}
