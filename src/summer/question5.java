import java.util.Scanner;
public class question5
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter First String :-");
        String first = sc.nextLine();
        System.out.println("Please Enter Second String :-");
        String second = sc.nextLine();
        String combine=first;
        int len=second.length();
        for (int i=len-1;i>=0;i--)
        combine=combine+second.charAt(i);
        System.out.println("Combined String is :- " + combine);
        
    }
    
}
