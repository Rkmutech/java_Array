package question_12;

public class qus_12 {
    public static void format_print(int arr[])
    {
         int le=arr.length;
         
         for(int i=0;i<le;i++)
         
         {
            if(arr[i]==0)
            {
                System.out.print("{");
            }
            System.out.print(i+" "+"index"+" "+" value "+arr[i]+" ");
         }
         System.out.print("}");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        format_print(arr);
        
    }
    
}
