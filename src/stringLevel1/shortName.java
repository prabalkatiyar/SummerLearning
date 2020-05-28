package stringLevel1;
import java.util.*;
public class shortName {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your First name :-");
    String fname=in.nextLine();
    System.out.println("Please enter your Mid name :-");
    String mname=in.nextLine();
    System.out.println("Please enter your Last name :-");
    String lname=in.nextLine();
    String sname=fname.charAt(0)+"."+mname.charAt(0)+"."+lname.charAt(0)+".";
    System.out.println("Name :- "+sname.toUpperCase());
    }
}
