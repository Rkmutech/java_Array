package question_25;

public class qus_25 {
    public static void odd_even(int arr[])
    {
        int n=arr.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
              even++;
            }
            else if(i%2==1)
            {
                odd++;
            }
        }
        System.out.println("The even is :"+even);
        System.out.println("The odd is  :"+odd);

    }
    public static void main(String[] args) {
        int[] arr={23,56,89,56,78,89,12,34,45};
        odd_even(arr);
    }
    
}
