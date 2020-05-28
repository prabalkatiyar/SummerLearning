package summer.stringLevel1;
import java.util.*;
public class CompareString {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter First String :-");
    String first=in.nextLine();
    System.out.println("Please enter Second String :-");
    String second=in.nextLine();
    double com=first.compareTo(second);
    if(com==0)
        System.out.println("Both Strings are Same.");
    else
        System.out.println("Both Strings are different.");
    }
}
