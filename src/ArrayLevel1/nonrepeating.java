package ArrayLevel1;
import java.util.*;
public class nonrepeating {
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
        System.out.println("Non-repeating Elements of array are :-");
        for(int i=0;i<len;i++)
        {
            flag=0;
        for(int j=0;j<len;j++)
        {
        if(arr[i]==arr[j]&&i!=j)
        {
        flag=1;
        }
        }
        if(flag==0)
        {
        System.out.println(arr[i]);
        }
        }

    }
}
