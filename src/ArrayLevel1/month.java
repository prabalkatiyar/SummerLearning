package ArrayLevel1;
import java.util.*;
public class month {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int flag=0;
        int days[]={31,30,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("Enter the Name of Month :- ");
        String mon=in.next();
        for(int i=0;i<12;i++)
        {
        if(mon.equalsIgnoreCase(months[i]))
        {
        System.out.print(mon+" has "+days[i]+" days.");
        flag=1;
        break;
        }
        }
        if(flag==0)
        {
        System.out.print("Invalid Input");
        }
    }
}
