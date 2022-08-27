package question_20;

public class qus_20 {
    public static int postive_postion_count(int arr[])
    {
        int count=0,n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr={-2,0,67,90,-45,89,1,8};
       int print=postive_postion_count(arr);
       System.out.println(print);
    }
    
}
