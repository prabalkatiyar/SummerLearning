package summer.stringLevel1;
import java.util.*;
public class Substring {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter any String :-");
    String str=in.nextLine();
    System.out.println("Please enter Starting index of SubsString :-");
    int start=in.nextInt();
    System.out.println("Please enter Ending index of SubsString :-");
    int end=in.nextInt();
    System.out.println("Substring is :- "+str.substring(start, end));
    }
}
