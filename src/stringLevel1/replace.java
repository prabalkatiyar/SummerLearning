package stringLevel1;

import java.util.Scanner;

public class replace 
{
    
    public static void main(String[] args)
    {
        String s1 = "15 August is Independence day";
        String s2 = s1.replace("15 August", "26 January");
        String s3 = s2.replace("Independence", "Republic");
        System.out.println(s3);
    }
}
