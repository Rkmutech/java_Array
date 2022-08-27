package question_7;

public class qus_7 {
    public static void odd_digit(int arr[])
    {
        int length=arr.length;
        for(int i=0;i<=length;i++)
        {
           /*  if(i==0)
            {
                System.out.println(arr[i]);
            }*/
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }

        }
        
    }
    public static void main(String[] args) {
        int[] arr={45,67,89,12,0,67,657,89,67,8};
       odd_digit(arr) ;
    }
    
}
