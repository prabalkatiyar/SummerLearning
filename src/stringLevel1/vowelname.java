package stringLevel1;
import java.util.*;
public class vowelname {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    String names[]=new String[5];
    String vowels[]={"a","e","i","o","u","A","E","I","O","U"};
    System.out.println("Please enter the names :-");
    for (int i=0;i<5;i++)
    {
    names[i]=in.nextLine();
    }
    System.out.println("Names Starting with vowel :- ");
    for (int i=0;i<5;i++)
    {
        for(int j=0;j<10;j++)
    if(names[i].startsWith(vowels[j]))
    {
    System.out.println(""+names[i]);
    }
    }
    }
}
