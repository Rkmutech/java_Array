package question_42;

public class qus_42 {
    public static int location_found(int arr[],int x)
    {
        int n=arr.length,location=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
           location=i;
           break;
            }
        }
       return location;
    }
    public static void main(String[] args) {
        int[] arr={12,56,78,98,45,76,34,56};
        int x=45;
        int print=location_found(arr, x);
        if(print!=0)
        {
            System.out.println("The location is : "+print);
        }
        else
        {
            System.out.println("The Location not found in the array");
        }

        
    }
    
}
