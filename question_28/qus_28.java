package question_28;

public class qus_28 {
    public static  int[] copy_Array(int arr[])
    {
        int n=arr.length;
        int[] b=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            b[i]=arr[i];

        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr={12,56,90,76,21,34,89,90};
        int[] print=copy_Array(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(print[i]);
        }
    }
    
}
