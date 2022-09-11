package question_39;

public class qus_39 {
    public static int occurance_index(int arr[],int x)
    {
        int n=arr.length,count=0,occurance_index=0;
        for(int i=0;i<n;i++)
        {
            
           if(arr[i]==x)
           {
            count++;
            if(count>=2)
            {
                occurance_index=i;
                break;
            }
           }
           
        }
        return occurance_index;
    }
    public static void main(String[] args) 
    {
        int[] arr={12,45,678,89,36,56,23,56,56};
        int x=56;
        int print=occurance_index(arr, x);
        if(print!=0)
        {
            System.out.println("The index is:"+print);
        }
        else{
            System.out.println("Not occurce in the twince");
        }
        
    }
    
}
