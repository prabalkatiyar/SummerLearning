import java.util.Scanner;
public class wordlength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any String");
        String str = sc.nextLine();
        char ch;
        int len = str.length();
        int l=0,s=0,count=0;
        
        for(int i =0;i<len;i++)
        {
          ch = str.charAt(i);
          if(ch==' '||ch==','||ch=='.')
          {
          l=i-s;
          if(l>5)
          {
          count++;
          }
          s=i+1;
          }
        }
        System.out.println(count);
        
    }
}
