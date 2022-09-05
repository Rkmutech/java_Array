package question_37;

public class qus_37 {
    public static int target_location(int arr[],int x)
    {
      int n=arr.length,count=0,temp=0;
      for(int i=0;i<n;i++)
      {
        count++;
        if(arr[i]==x)
        {
            temp=count;
            break;
        }
        else{
            temp=0;
        }
      }
      return temp-1;
    }
    public static void main(String[] args) {
        int[] arr={23,67,89,546,324,678};
        int x=89;
        int print=target_location(arr, x);
        if(print!=0)
        {
            System.out.println(print);
        }
        else
        {
            System.out.println("index is not found");
        }
    }
    
}
