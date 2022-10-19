/**
 * Arraysum
 */
import java.util.Scanner;
public class Arraysum {

    public static void main(String [] args)
    {
       Scanner s = new Scanner(System.in);
         int size =  s.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }
        // Sum
        int sum =0;
        for(int x : arr)
        {
            sum+=x;
        }
        System.out.println("Sum of Elements in arr"+" "+sum);
    }
}