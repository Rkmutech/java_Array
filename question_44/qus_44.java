package question_44;

public class qus_44 {
    public static int[] insert_location(int arr[],int k,int x)
    {
        int n=arr.length;
        int[] newarray=new int[arr.length+1];
        for(int i=0,index=0;i<n;i++)
        {
            
            if(i==k)
            {
               newarray[index++]=x;
            }
            newarray[index++]=arr[i];
            
            
        }
        return newarray;
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,56,7};
        int k=3,x=45;
        int[] arr1=insert_location(arr, k, x);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        
    }
    
}
