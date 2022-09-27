package question_55;

public class qus_55 {
    public static int missing_element(int arr[])
    {
        int n=arr.length,missing_element=0;
        int missing=0;
        n=(n+1)*(n+2)/2;
        System.out.println("n="+n);
        for(int i=0;i<arr.length;i++)
        {
            
                missing+=arr[i];
            
        }
       missing_element=n-missing;
       //System.out.println(missing);
       //System.out.println(n);
      // System.out.println(missing_element);
        return missing_element;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6};
        int print=missing_element(arr);
       // System.out.println(print);
    }
    
}
