package question_41;

public class qus_41 {
    public static int number_times_x(int arr[],int x)
    {
        int n=arr.length,count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                ++count;
            }
            
        }
        System.out.println("The count is:"+count);
        return count;
    }
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,5,5,5,679,89};
        int x=10;
        int print=number_times_x(arr, x);
        if(print>0)
        {
            System.out.println("The x value occurance is: "+print);
        }
        else
        {
            System.out.println(" x value not more than one not occurance in the array");
        }

        
    }
    
}
