package summer.stringLevel1;
import java.util.*;
public class Pallindrome {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any word :-");
    String str=in.nextLine();
    String rev="";
    int len=str.length();
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev))
        {
           System.out.println("String is pallindrome");
        }
           else
        {
            System.out.println("String is not pallindrome");
        }
    }
}
