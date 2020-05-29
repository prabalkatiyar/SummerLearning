package ArrayLevel1;
import java.util.*;
public class prime {
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
        System.out.println("Prime numbers present in array are :-");
        for(int i=0;i<len;i++)
        {
            flag=0;
        for(int j=2;j<arr[i];j++)
        {
        if(arr[i]%j==0)
        {
        flag=1;
        }
        }
        if(flag==0&&arr[i]>1)
        {
        System.out.println(arr[i]);
        }
        }

    }
}
