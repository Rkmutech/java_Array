package question_47;

public class qus_47 {
    public static int smallest_comparssion_count(int arr[])
    {
        int small=arr[0],count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
                //count++;
            }
            if(arr[i]==small)
            {
                count++;
            }
        }
        System.out.println(small);
        return count;
    }
    public static void main(String[] args) {
        int[] arr={52,45,67,89,34,56,78};
        int print=smallest_comparssion_count(arr);
        System.out.println(print);
        
    }
    
}
