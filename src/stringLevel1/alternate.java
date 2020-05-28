package stringLevel1;
import java.util.*;
public class alternate {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please any String :-");
    String str=in.nextLine();
    int len=str.length();
    char ch;
    String alt="",temp="";
    for (int i=0;i<len;i++)
    {
        temp="";
        ch=str.charAt(i);
        temp=temp+ch;
    if(i%2!=0)
    {
        alt=alt+temp.toUpperCase();
    }
    else
    {
        alt=alt+temp.toLowerCase();
    }
    }
    System.out.println("New Stirng is :"+alt);
    }
}
