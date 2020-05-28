package stringLevel1;
import java.util.*;
public class DayNumber {
    public static void main(String[] args)
    {
        String days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday",""};
        int dayno[]={1,2,3,4,5,6,7};
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the Day name :-");
    String dname=in.next();
    for (int i=0;i<=6;i++)
    {
    if(dname.equalsIgnoreCase(days[i]))
    {
    System.out.println("Day no. of day "+dname+" is :- "+dayno[i]);
    }
    }
    
    }
}
