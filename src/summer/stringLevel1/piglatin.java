package summer.stringLevel1;
import java.util.*;
public class piglatin {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any word :-");
    String str=in.nextLine();
    int len=str.length();
    int x=0;
    String newword="";
    char ch;
        for (int i=0;i<len;i++)
        {
            ch=str.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
          {
          x=i;
          break;
          }
        }
        for (int i=x;i<len;i++)
        {
            ch=str.charAt(i);
            newword=newword+ch;
        }
        for (int i=0;i<x;i++)
        {
            ch=str.charAt(i);
            newword=newword+ch;
        }
        newword=newword+"ay";
    System.out.println("Piglatin form of word is : -"+newword);
    }
}
