package question_23;

public class qus_23 {
    public static void ignoring_0_element(int arr[])
    {
        int n=arr.length;
        int count=0,sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                count++;
                sum+=arr[i];
            }
        }
        int mean=sum/count;
        System.out.println("The Mean element is :"+mean);

    }
    public static void main(String[] args) {
        int[] arr={23,56,0,56,67,78,43,45,56,56};
        ignoring_0_element(arr);
        
    }
    
}
