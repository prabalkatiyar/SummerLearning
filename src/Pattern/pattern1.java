package Pattern;
import java.util.*;
public class pattern1 {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any word:-");
    String word=in.nextLine();
    int len=word.length();
    char ch;
    for (int i=0;i<len;i++)
    {
    for (int j=0;j<=i;j++)
    {
        ch=word.charAt(j);
    System.out.print(ch);
    }
    System.out.println();
    }
    
    }
}
