package summer.stringLevel1;
import java.util.*;
public class VowelCount {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please any String :-");
    String str=in.nextLine();
    int len=str.length();
    char ch;
    int count=0;
    for (int i=0;i<len;i++)
    {
        ch=str.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
    count+=1;
    }
    }
    System.out.println("No. of Vowels in string are "+count);
    }
}
