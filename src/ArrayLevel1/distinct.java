package ArrayLevel1;
import java.util.*;
public class distinct {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        int dist[]=new int[100];
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        int flag=0,k=0;
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len;i++)
        {
            flag=0;
        for(int j=0;j<len;j++)
        {
        if(arr[i]==dist[j])
        {
        flag=1;
        }
        }
        if(flag==0)
        {
        dist[k]=arr[i];
        k++;
        }
        }
        System.out.println("Distinct Elements of array are :-");
        for(int i=0;i<k;i++)
        {
        System.out.println(dist[i]);
        }
    }
}
