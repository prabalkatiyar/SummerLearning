package ArrayLevel1;
import java.util.*;
public class positive {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int count=0;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
        if(arr[i]>0)
        {
        count+=1;
        }
        }
                System.out.println("No of Positive Elements in Array is :- "+count);

    }
}
