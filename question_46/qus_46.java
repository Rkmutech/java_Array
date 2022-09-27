package question_46;

public class qus_46 {
    public static int smallest_number(int arr[])
    {
        int small=arr[0];
       //int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                 //count++;
                small=arr[i];
                
            }
        }
        //System.out.println("The count :"+count);
        return small;
    }
    public static void main(String[] args) {
        int[] arr={12,45,67,89,3,56,78};
       int print= smallest_number(arr);
        System.out.println(print);
    }
    
}
