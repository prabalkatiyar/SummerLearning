package ArrayLevel1;
import java.util.*;
public class largest_smallest {
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
        int large=arr[0],small=arr[0];
        for(int i=0;i<len;i++)
        {
        if(large<=arr[i])
        {
        large=arr[i];
        }
        }
        for(int i=0;i<len;i++)
        {
        if(small>=arr[i])
        {
        small=arr[i];
        }
        }
        System.out.println("Smallest Elements of Array is :- "+small);
        System.out.println("Largest Elements of Array is :- "+large);

    }
}
