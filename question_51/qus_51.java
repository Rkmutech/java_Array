package question_51;

public class qus_51 {
    public static void first_largest_element_and_second_largest_element(int arr[])
    {
        int n=arr.length,first_element=0,second_element=0;
        for(int i=0;i<n-1;i++)
        {
            first_element=arr[0];
            if(arr[i]>first_element)
            {
                first_element=arr[i];
            }
            //second_element=first_element-1;
            if(arr[i]!=first_element)
            {
                second_element=arr[i];
            }

        }
        System.out.println("First_largest_element="+first_element);
       System.out.println("second_largest_element="+second_element);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,8,90,45};
        first_largest_element_and_second_largest_element(arr);
        
    }
    
}
