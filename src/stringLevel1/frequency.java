package stringLevel1;
import java.util.*;
public class frequency {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the String :-");
    String str=in.nextLine();
    int fre_b=0,fre_a=0,fre_n=0;
    int len=str.length();
    char ch;
    for(int i=0;i<len;i++)
    {
        ch=str.charAt(i);
    if(ch=='b')
    {
        fre_b++;
    }
    else if(ch=='a')
    {
        fre_a++;
    }
    else if(ch=='n')
    {
        fre_n++;
    }
}
        System.out.println("Frequency of b is "+fre_b);
        System.out.println("Frequency of a is "+fre_a);
        System.out.println("Frequency of n is "+fre_n);
}
}