package ArrayLevel1;
import java.util.*;
public class merge2 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int fir[]=new int[100];
        int sec[]=new int[100];
        System.out.print("Enter the size of First Array :- ");
        int len1=in.nextInt();
        int i=0,j=0,k=0;
        System.out.println("Enter the elements of First Array :- ");
        for(int x=0;x<len1;x++)
        {
        fir[x]=in.nextInt();
        }
        System.out.print("Enter the size of Second Array :- ");
        int len2=in.nextInt();
        System.out.println("Enter the elements of Second Array :- ");
        for(int x=0;x<len2;x++)
        {
        sec[x]=in.nextInt();
        }
        while(i<len1&&j<len2)
        {
           if(fir[i]<=sec[j])
           {
               //third[k]=fir[i];
               
               shift(sec,len2,fir[i],j);
               i++;
               len2++;
           }
           else
           {
           j++;
           }
        }
        while(i<len1)
        {
               sec[j]=fir[i];
               j++;
               i++;
        }
         System.out.println("Elements of Third Array are :- ");
        for(int x=0;x<len2;x++)
        {
        System.out.println(sec[x]);
        }
    }
    public static void shift(int a[],int len,int x,int j)
    {
        int i=len-1;
    while(i>=j)
    {
    a[i+1]=a[i];
    i--;
    }
    a[i+1]=x;
    }
}
