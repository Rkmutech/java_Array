package swap_array;

import java.util.Arrays;

public class array {
   /*  public static int[] swap_2(int[] array_1,int[] array_2)
    {
        int[] swap=new int[array_2.length];
        for(int i=0;i<array_1.length;i++)
        {
            swap[i]=array_2[i];
            array_2[i]=array_1[i];
        }


        return swap;

    }*/
    public static void swap(int[] array_1,int[] array_2)
    {
        int n=array_1.length;
        int[] swap_array=new int[n];
        int[] swap_2=new int[n];
        for(int i=0;i<array_1.length;i++)
        {
            swap_array[i]=array_1[i];
            array_1[i]=array_2[i];
            swap_2[i]=array_2[i];
            array_2[i]=swap_array[i];

        }
      // int[] array_2= swap_2(array_1,array_2);

       /* for(int i=0;i<n;i++)
        {
            System.out.println(" After Swap "+array_1[i]);
           // System.out.println(array_2[i]);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("After swap"+array_2[i]);
           // System.out.println(array_2[i]);
        } */
        System.out.println("After Swapping Array_1"+Arrays.toString(array_1));
        System.out.println("After Swapping Array_2"+Arrays.toString(array_2));

        

    }

    public static void main(String[] args) {
        int[] array_1={12,14,16,18};
        int[] array_2={23,29,22,25};
        /*for(int i=0;i<array_1.length;i++)
        {
            System.out.println("Before swap"+array_1[i]);
            //System.out.println("The array_2"+array_2[i]);
        }
        for(int i=0;i<array_1.length;i++)
        {
           // System.out.println("The array_1"+array_1[i]);
            System.out.println("Before swap"+array_2[i]);
        }*/
        System.out.println("Before Swapping array_1"+Arrays.toString(array_1));
        System.out.println("Before Swapping Array_2"+Arrays.toString(array_2));
       swap(array_1, array_2);
    }
    
}
