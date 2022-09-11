package question_38;

public class qus_38 {
    public static int more_than_once(int arr[],int x)
    {
        int n=arr.length,count=0,temp=0;
        for(int i=0;i<n;i++)

        {
            if(arr[i]==x)
            {
                count++;
                if(count>=2)
            {
              temp=arr[i]; 
            }
            else
            {
                temp=0;
            }
            }
            
        }
        return temp;
        
    }

    public static void main(String[] args) {
        int[] arr={12,45,78,54,78,454,54};
        int x=78;
        int print=more_than_once(arr, x);
        if(print!=0)
        {
            System.out.println("Yes the value is more than once in the array and the value is:"+print);
        }
        else
        {
            System.out.println("the value is not more than onces");
        }
        
    }
    
}
