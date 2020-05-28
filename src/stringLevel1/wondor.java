import java.util.Scanner;
public class wondor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       String country[] ={"India","Jordan","Italy","Peru","China","Mexico","Brazil"};
       String wonder[] = {"Tajmahal","Petra","Colloseum","Machu Picchu","The Great Wall of China","Chichen Itza","Christ - The Redeemer"};
       String cn;
       int i;
        System.out.println("..........Enter any country name is to be serach........");
        cn = sc.nextLine();
       for( i =0 ;i<7 ;i++)   
       {
        if(country[i].equalsIgnoreCase(cn))
        {
            System.out.println(wonder[i]);
        }
       }
    } 
}
