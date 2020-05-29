package ArrayLevel1;
import java.util.*;
public class extractEven {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        int sec[]=new int[100];
        System.out.print("Enter the size of First Array :- ");
        int len=in.nextInt();
        int k=0;
        System.out.println("Enter the elements of First Array :- ");
        for(int x=0;x<len;x++)
        {
        arr[x]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
        if(arr[i]%2==0)
        {
        sec[k]=arr[i];
        k++;
        }
        }
         System.out.println("Even elements of Array are :- ");
        for(int x=0;x<k;x++)
        {
        System.out.println(sec[x]);
        }
    }
}
