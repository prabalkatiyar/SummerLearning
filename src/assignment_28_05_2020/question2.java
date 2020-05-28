package assignment_28_05_2020;

import java.util.Scanner;
public class question2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String name,replacedString="";
        char ch;
        System.out.println("Please enter the string :-");
        name = sc.nextLine();
        int len=name.length();
        for (int i=0;i<len;i++)
        {
            ch=name.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
        replacedString=name.replace(ch,'z');
        }
        }
        System.out.println("Replaced String is ;- " + replacedString);
    }
}
