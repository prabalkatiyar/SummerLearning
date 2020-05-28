package stringLevel1;
import java.util.*;
public class MeritList {
    public static void main(String[] args)
    {
        int temp;
    Scanner in = new Scanner(System.in);
    String name[]=new String[5];
    int marks[]=new int[5];
    String temps;
    for(int i=0;i<5;i++)
    {
            System.out.println("Please enter the name of Student and Total Marks Obtained:-");

    name[i]=in.next();
    marks[i]=in.nextInt();
    }
    for(int i=0;i<5;i++)
    {
    for(int j=0;j<5-i-1;j++)
    {
    if(marks[j]<marks[j+1])
    {
    temp=marks[j];
    marks[j]=marks[j+1];
    marks[j+1]=temp;
    temps=name[j];
    name[j]=name[j+1];
    name[j+1]=temps;
    }
    }
    }
    System.out.println("Merit List is :-");
System.out.println("Rank- Name  -  Marks Obtained");  
    for(int i=0;i<5;i++)
    {
      System.out.println((i+1)+"-  "+name[i]+"  -  "+marks[i]);  
    }
    
    }
}
