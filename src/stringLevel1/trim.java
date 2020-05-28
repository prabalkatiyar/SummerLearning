package stringLevel1;
import java.util.*;
public class trim {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please any String :-");
    String str=in.nextLine();
    String newstr=str.trim();
    System.out.println("String after trimming is :- "+newstr);
    }
}
