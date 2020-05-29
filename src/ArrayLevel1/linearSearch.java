package ArrayLevel1;
import java.util.*;
public class linearSearch {
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
        for(int i=0;i<len;i++)
        {
        if(find==arr[i])
        {
            flag=i;
            
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
