package ArrayLevel1;
import java.util.*;
public class merge {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int fir[]=new int[100];
        int sec[]=new int[100];
        int third[]=new int[100];
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
               third[k]=fir[i];
               k++;
               i++;
           }
           else
           {
               third[k]=sec[j];
               k++;
               j++;
           }
        }
        while(i<len1)
        {
               third[k]=fir[i];
               k++;
               i++;
        }
        while(j<len2)
        {
               third[k]=sec[j];
               k++;
               j++;
        }
         System.out.println("Elements of Third Array are :- ");
        for(int x=0;x<k;x++)
        {
        System.out.println(third[x]);
        }
    }
}
