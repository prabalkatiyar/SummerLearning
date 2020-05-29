package Pattern;
import java.util.*;
public class pattern2 {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any word:-");
    String word=in.nextLine();
    int len=word.length();
    char ch1,ch2;
    for (int i=0;i<len;i++)
    {
        for (int k=len;k>i;k--)
        {
        System.out.print(" ");
        }
    for (int j=0;j<=i;j++)
    {
        ch1=word.charAt(j);
    System.out.print(ch1);
    }
    for (int l=i-1;l>=0;l--)
    {
        ch2=word.charAt(l);
    System.out.print(ch2);
    }
    System.out.println();
    }
    
    }
}
