import java.util.Arrays;;
public class arr {
    
    public static void main(String[] args) {
        int arr[]={50,100,78,38,89,2,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count=0;
        System.out.println("The count is before for loop:"+count);
        for(int i=0;i<5;i++)
        {
            count++;
            System.out.print("the count is After for loop:"+count);
        }
        System.out.print("the count is"+count);
    }
}
