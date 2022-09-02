package question_15;

public class qus_15 {
    public static void even_postion_sum(int arr[])
    {
        int n=arr.length,sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
               sum+=arr[i];
            }
        }
        System.out.println("The length is:"+n);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        //int[] arr={13,67,89,56,89,90,35,78,7634,78};
        int[] arr={1,1,1,1};
        even_postion_sum(arr);
    }
    
}
