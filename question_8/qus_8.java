package question_8;



public class qus_8 {
    public static void odd_location(int arr[])
    {
        int length =arr.length;
        for(int i=0;i<length;i++)
        {
            if(i%2==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={67,89,56,45,67,89,78,546,86,1,-1};
        odd_location(arr);
        
    }
    
}
