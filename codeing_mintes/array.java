public class array {
    //input  1 2 3 4 5
    //output 5 1 2 3 4 
    public static void rotate_array(int[] arr)
    {
        int n=arr.length,swap=0;
        
        for(int i=0;i<1;i++)
        {
           swap=arr[n];
           arr[i]=swap;    
        }
        for(int i=0;i<n-1;i++)
        {
            System.out.println(arr[i]);

        }
        
    }
    public static void main(String[] args) {

int[] arr={1,2,3,4,5};
int n=arr.length;
rotate_array(arr);

        
    }
    
}
