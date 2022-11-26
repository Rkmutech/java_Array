package sort;

public class sort {
    public static void swap(int i,int j) {
        
    }
    public static void sort_array(int array[],int n)
    {
         for(int i=0;i<n;i++)
         {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
            {
                int swap=array[i];
                array[i]=array[j];
                array[j]=swap;
            }

            }
            
            //System.out.println(array[i]);
         }
         for(int i=0;i<n-1;i++)
         {
            System.out.print(array[i]+"\t");

         }
        
    }
    public static void main(String[] args) {
        int[] array={12,5,67,89,90,23,4};
        int n=array.length;
        sort_array(array, n);
        
    }
    
}
