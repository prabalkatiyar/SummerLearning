package summer.stringLevel1;
import java.util.*;
public class CapitalLetters {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please any String :-");
    String str=in.nextLine();
    int len=str.length();
    char ch;
    int capcount=0,smallcount=0;
    for (int i=0;i<len;i++)
    {
        ch=str.charAt(i);
    if(ch>=65&&ch<=90)
    {
    capcount+=1;
    }
    else if(ch>=97&&ch<=122)
    {
    smallcount+=1;
    }
    }
    System.out.println("No. of Capital Letters in string are "+capcount);
    System.out.println("No. of Small Letters in string are "+smallcount);
    }
}
