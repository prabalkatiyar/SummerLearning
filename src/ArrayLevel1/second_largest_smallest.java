package ArrayLevel1;
import java.util.*;
public class second_largest_smallest {
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
        int temp;
        for(int i=0;i<len;i++)
        {
        for(int j=0;j<len-i-1;j++)
        {
        if(arr[j]>arr[j+1])
        {
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
        }
        }
        System.out.println("Second Smallest Elements of Array is :- "+arr[1]);
        System.out.println("Second Largest Elements of Array is :- "+arr[len-2]);

    }
}
