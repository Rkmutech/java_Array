package question_13;

public class qus_13 {
    public static void subract_first_index(int arr[])
    {
         int n=arr.length;
         for(int i=0;i<n;i++)
         {
            System.out.println(arr[0]-arr[i]);
         }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,67,8,45,89};
        subract_first_index(arr);
        
    }
    
}
