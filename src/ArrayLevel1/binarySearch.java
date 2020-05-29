package ArrayLevel1;
import java.util.*;
public class binarySearch {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int flag=0;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        System.out.println("Enter the elements to be searched in Array :- ");
        int find=in.nextInt();
        int beg=0,end=len-1,mid,temp;
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
        while(beg<=end)
        {
        mid=(beg+end)/2;
        if(find==arr[mid])
        {
        flag=mid;
        break;
        }
        else if(find<arr[mid])
        {
        end=mid-1;
        }
        else
        {
        beg=mid+1;
        }
        }
        if(flag!=0)
        {
        System.out.println("Elements is found in Array at position :- "+(flag+1));
        }
        else
        {
        System.out.println("Elements is not found in Array");
        }
    }
}
