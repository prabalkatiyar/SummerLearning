package ArrayLevel1;
import java.util.*;
public class selectionSort {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int temp,smallindex;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            smallindex=i;
        for(int j=i;j<len-1;j++)
        {
        if(arr[smallindex]>arr[j])
        {
        smallindex=j;
        
        }
        }
        temp=arr[smallindex];
        arr[smallindex]=arr[i];
        arr[i]=temp;
        }
        System.out.println("Sorted Array is :-");
        for(int i=0;i<len;i++)
        {
        System.out.println(arr[i]);
        }

    }
}