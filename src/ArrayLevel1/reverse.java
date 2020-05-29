package ArrayLevel1;
import java.util.*;
public class reverse {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[100];
        int temp;
        System.out.print("Enter the size of Array :- ");
        int len=in.nextInt();
        System.out.println("Enter the elements of Array :- ");
        for(int i=0;i<len;i++)
        {
        arr[i]=in.nextInt();
        }
        for(int i=0;i<len/2;i++)
        {
        temp=arr[i];
        arr[i]=arr[len-i-1];
        arr[len-i-1]=temp;
                System.out.println(temp);

        }
        System.out.println("Reversed Array is :- ");
        for(int i=0;i<len;i++)
        {
        System.out.println(arr[i]);
        }
            

    }
}
