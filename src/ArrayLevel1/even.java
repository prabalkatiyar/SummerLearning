package ArrayLevel1;
import java.util.*;
public class even {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int sum=0,count=0;
        double avg;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
        if(arr[i]%2==0)
        {
        sum+=arr[i];
        count++;
        }
        }
        avg=(sum/count);
                System.out.println("Average of Even Elements of Array is :- "+avg);

    }
}
