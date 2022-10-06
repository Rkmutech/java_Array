package search;

public class binary {
    public static int search_2(int arr[],int search_element,int n)
    {
        int re=0;
        for(int i=n;i<arr.length;i++)
        {
           // System.out.println(arr[i]);
            if(arr[i]==search_element)
            {
              re=i;
              break;
            }
            else 
            {
                re=-1;
            }
           // System.out.println(re);
        }
        return re;

    }
    public static int search_1(int arr[],int search_element,int n)
    {
        int re=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==search_element)
            {
              re=  i;
              break ;
            }
            else 
            {
                re= -1;
            }
        }
        return re;
    }
    public static int search(int arr[],int search_element)
    {
        int n=arr.length;
        int search_1=n/2;
        int search_2=search_1+1;
       int print_1= search_1(arr,search_element,search_1);
       int print_2= search_2(arr,search_element,search_2);
       int print;
    if(print_1>0 )
    {
        print=print_1;
    }
    else if(print_2>0)
    {
        print=print_2;
    }
    else{
        print=-1;
    }

        return print;
    }
    public static void main(String[] args) {
        int[] arr={12,34,78,78,45,67,34,23,56};
        int search_element=10;
       int print= search(arr,search_element);
       System.out.println("The index is:"+print);
    }
    
}
