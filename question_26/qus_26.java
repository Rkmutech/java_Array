package question_26;

public class qus_26 {
    public static int[] perfect_squre(int arr[])
    {
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
          arr1[i]=arr[i]*arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] squre=perfect_squre(arr);
        System.out.println(squre);
        
    }
    
}
