package question_49;

public class qus_49 {
    public static int largest_number(int arr[])
    {
        int largest_number=arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>largest_number)
          {
            largest_number=arr[i];
          }  
        }
        return largest_number;
    }
    public static void main(String[] args) {
        int[] arr={34,67,89,46,56,86,66};
        int print=largest_number(arr);
        System.out.println(print);
        
    }
    
}
