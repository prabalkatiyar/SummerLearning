public class methodQuestion1 {
    public static void main(String[] args)
    {
        
        methodQuestion1 ob=new methodQuestion1();
        ob.m1();
        ob.m2(20);
        int x=ob.m3();
        System.out.println("Value of a in method m3 is "+x);
        int y=ob.m4(30);
        System.out.println("Value returned by method m4 is "+y);
    }
    public void m1()
    {
    System.out.println("WE ARE IN METHOD m1");
    }
    public void m2(int a)
    {
    System.out.println("WE ARE IN METHOD m2");
    System.out.println("vlaue of a is "+a);
    }
    public int m3()
    {
        int a=10;
    System.out.println("WE ARE IN METHOD m3");
    return a;
    }
    public int m4(int b)
    {
        int a=10;
    System.out.println("WE ARE IN METHOD m3");
    int sum=a+b;
    return sum;
    }
}
