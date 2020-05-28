package summer.stringLevel1;
import java.util.*;
public class CountWord {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please Enter any String  :-");
    String str=in.nextLine();
    int len = str.length();
    int count=1;
    char ch;
    for(int i =0 ; i<len; i++)
        {
           ch= str.charAt(i);
           if(ch == ' ')
           {
              count++; 
           }
        }
        System.out.println("The word in a Sentence is  " + count);
    }
}
