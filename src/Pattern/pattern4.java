package Pattern;
import java.util.*;
public class pattern4 {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any word:-");
    String word=in.nextLine();
    int len=word.length();
    char ch,ch1;
    for (int i=0;i<=len;i++)
    {
    for (int j=i;j<len;j++)
    {
        ch=word.charAt(j);
    System.out.print(ch);
    }
    for (int k=0;k<i;k++)
    {
        ch1=word.toLowerCase().charAt(k);
    System.out.print(ch1);
    }
    System.out.println();
    }
    
    }
}
