package perfect_squre;

public class perfect_squre {
    public static void squre(int n )
    {
        if(n==1 || n==0)
        System.out.println("Not perfect squre");
        int squre=n*n;
        if(squre==n)
        {
            System.out.println("perfect squre");
        }

    }

    public static void main(String[] args) {
        int squ=25;
        squre(squ);
        
    }
    
}
