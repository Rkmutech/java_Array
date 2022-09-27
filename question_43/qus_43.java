package question_43;

public class qus_43 {
    public static int[] occurance_remove(int arr[],int k)
    {
        int n=arr.length;
        //int n1=arr.length-1;
        int[] newarray=new int[arr.length-1];
        for(int i=0,index=0;i<n;i++)
        {
            if(k==i)
            {
                continue;
            }

            newarray[index++]=arr[i];
        }
        return newarray;
    }
    public static void main(String[] args) {
        int[] arr={12,56,89,43,45,89,90};
        int k=3;
        int[] newarray= occurance_remove(arr, k);
        
       
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(newarray[i]);
        }
        
    }
    
}
