package duplicate_Array;

public class dup {
    public static int Arr(int arr[],int n)
    {
        int duplicate=0;
        int count=0,temp=0;
        for(int i=0;i<n;i++)
        {
           
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
            {
               count++;
               temp=arr[i]
               
            }
            

            }
            
            if(count>0)
            duplicate++; 
        }
       // if(duplicate>1)
        return duplicate;

    }
    public static void main(String[] args) {
        int[] arr={1,3,4,56,7,89,7,4,4,3,4};
        int n=arr.length;
       int print= Arr(arr,n);
       System.out.println(print);
    }
    
}
