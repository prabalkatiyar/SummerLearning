import java.util.Scanner;
public class question1
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        String name;
        StringBuffer name1=new StringBuffer();
        System.out.println("Enter String");
          name = sc.nextLine();
        int len=name.length();
        for (int i=len-1;i>=0;i--)
        {
            name1.append(name.charAt(i));
        }
        System.out.print("Reversed String is :- ");
        System.out.println(name1);
    }
    
}
