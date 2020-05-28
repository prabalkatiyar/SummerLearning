import java.util.Scanner;
public class ExtractPallindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any String");
        String str = sc.nextLine();
        char ch;
        int len = str.length();
        String arr[]=new String[len];
        int l=0,s=0,a=0;
        int leng;
        String rev="";
        for(int i =0;i<len;i++)
        {
          ch = str.charAt(i);
          if(ch==' '||ch==','||ch=='.')
          {
          l=i-s;
          arr[a]=str.substring(s,i);
          a++;
          s=i+1;
          }
        }
        for(int i =0;i<a;i++)
        {
            System.out.println("-"+arr[i]);
            
        }
        
        System.out.println("Pallindrome words in string are : ");

      for(int i =0;i<a;i++)
        {
        leng=arr[i].length();
        for(int j=leng-1;j>=0;j--)
        {
        rev=rev+arr[i].charAt(j);
        }
        System.out.println(rev);
        if(arr[i].equals(rev))
        {
        System.out.println(arr[i]);
        }
        }
       
    }
}