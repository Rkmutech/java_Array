package question_48;

public class qus_48 {
    public static int smallest_index(int arr[])
    {
        int small=arr[0],index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i];
            }
            if(small==arr[i])
            {
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={52,56,89,45,78,16};
        int print=smallest_index(arr);
        System.out.println(print);
    }
    
}
