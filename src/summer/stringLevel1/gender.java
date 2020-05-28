package summer.stringLevel1;
import java.util.*;
public class gender {
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the name :-");
    String name=in.nextLine();
    String gen;
    
    if(name.startsWith("Mr."))
    {
        gen="Male";
            System.out.println("Gender of "+name+" is : "+gen);
    }
    else if(name.startsWith("Miss."))
    {
        gen="Female";
        System.out.println("Gender of "+name+" is : "+gen);
    }
    else
        if(name.startsWith("Mrs."))
    {
        gen="Married Female";
        System.out.println("Gender of "+name+" is : "+gen);
    }
        else if(name.endsWith("Kumari"))
    {
        gen="Female";
        System.out.println("Gender of "+name+" is : "+gen);
    }
    else
    {
        System.out.println("Connot Determine Gender");
    }
}
}
