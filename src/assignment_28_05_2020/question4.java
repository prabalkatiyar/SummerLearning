package assignment_28_05_2020;

import java.util.Scanner;
public class question4
{
    public static void main(String[] args)
    {
        char ch;
        int x=0,j=0,flag;
        Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter the String :-");
        String str = sc.nextLine();
        int len=str.length();
        int count[]=new int[len];
        char chr[]=new char[len];
        for (int i=0;i<len;i++)
        {
            flag=0;
            ch=str.charAt(i);
            for(j=0;j<=i;j++)
            {
            if(ch==chr[j])
            {
            count[j]++;
            flag=1;
            }
            }
            if(flag==0)
            {
             chr[x]=ch;
            count[x]=1;
             x++;
            }
        }
        for(int k=0;k<x;k++)
        System.out.println(chr[k]+" - "+count[k]);
    }
}
