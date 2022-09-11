package question_40;

public class qus_40 {
    public static int kth_occurance(int arr[],int x,int k)
    {
        int n=arr.length,count=0,temp=0;
        for(int i=0;i<n;i++)
        {
            if(x==arr[i])
            count++;
            {
                if(count==k)
                {
                    temp=i;
                    break;
                }
                else{
                    temp=0;
                }
            }
            
        }
        return temp;
         
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,56,56,6,7,56,56};
        int k=3,x=5;
        int print=kth_occurance(arr, x, k);
        if(print!=0)
        {
            System.out.println("The kth occurance location is :"+print);
        }
        else{
            System.out.println("not occur k time in  the array");
        }
       
        
    }
    
}
