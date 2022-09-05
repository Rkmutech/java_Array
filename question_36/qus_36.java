package question_36;

public class qus_36 {
    public static int target_value(int arr[],int x)
    {
        int n=arr.length,temp=0,location=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                
                temp=arr[i];
                location=i;
                break;
            }
            else{
                temp=0;
            }
            
        }
        System.out.println(location);
        
        return temp;
        
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,567,78};
        int x=10;
       int print= target_value(arr, x);
       if(print!=0)
       {
        System.out.println(print);
       }
       else
       {
        System.out.println("Not in the array");
       }
       
    }
    
}
