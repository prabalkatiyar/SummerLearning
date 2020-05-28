import java.util.Scanner;
public class question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Please Enter First String :-");
        String first = sc.nextLine();
        System.out.println("Please Enter Second String :-");
        String second = sc.nextLine();
        String combine=first.concat(second);
        System.out.println("Combined String is :- " + combine);
        
    }
    
}
