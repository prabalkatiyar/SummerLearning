import java.util.Scanner;

public class TitleCase
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any String");
        String str = sc.nextLine();
        String r = "",res="";
        char ch;
        int len = str.length();
        for(int i =0;i<len;i++)
        {
            r="";
          ch = str.charAt(i);
          if(i==0)
          {
          r=r+ch;
          res=res+r.toUpperCase();
          }
          else if(ch == ' ')
          {
             r = r + ' '+str.charAt(i+1);
            
             res=res+r.toUpperCase();
          }
          else
          {
              r=r+ch;
          res = res + r.toLowerCase();
        }
        }
        System.out.println(res);
        
    }
}
