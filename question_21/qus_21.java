package question_21;

public class qus_21 {
    public static int negative_postion_count(int arr[])
    {
        int count=0,length=arr.length;
        for(int i=0;i<length;i++)
        {
              if(arr[i]<0)
              {
                count++;
              }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={45,78,-23,78,-56,-89,-78,-45};
       int print= negative_postion_count(arr);
       System.out.println(print);
        
    }
    
}
