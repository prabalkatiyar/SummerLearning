package summer.stringLevel1;
import java.util.*;
public class Invert {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any String :-");
    String str=in.nextLine();
    int len=str.length();
    char ch;
    int a;
    String invert="";
    for (int i=0;i<len;i++)
    {
        ch=str.charAt(i);
        if(ch>=65&&ch<=90)
    {
        a=(int)ch+32;
           invert=invert+(char)a;
    }
    else if(ch>=97&&ch<=122)
    {
    a=(int)ch-32;
           invert=invert+(char)a;
    }
    }
    System.out.println("Result :- "+invert);
    }
}
