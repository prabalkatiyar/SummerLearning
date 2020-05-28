import java.util.Scanner;

public class lexicographic
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int r;;
       System.out.println("Please enter first string");
       String first = sc.nextLine();
       System.out.println("Please enter second string");
       String second = sc.nextLine();
       r = first.compareToIgnoreCase(second);
       if(r == 0)
       {
           System.out.println("Same string");
       }
       else if(r>0)
       {
           System.out.println(first+ " Comes later");  
       }
       else
       {
           System.out.println(second+ " Comes late");
       }
        
    }
}
