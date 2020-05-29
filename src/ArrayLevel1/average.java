package ArrayLevel1;
import java.util.*;
public class average {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int sum=0;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
        sum+=arr[i];
        }
                System.out.println("Sum of elements of Array is :- "+(sum/len));

    }
}
