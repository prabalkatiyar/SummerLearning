package assignment_28_05_2020;

public class methodQuestion2 {
    int a=1,b=2,c=3;
    public static void main(String[] args)
    {
        methodQuestion2 ob=new methodQuestion2(100,200,300);
        ob.display();
        int y=ob.sum();
        System.out.println("Sum of a, b, c is "+y);
        
    }
    methodQuestion2()
    {
    System.out.println("WE ARE IN DEFAULT CONSTRUCTOR");
    a=10;
    b=20;
    c=30;
    }
    methodQuestion2(int d,int e,int f)
    {
    System.out.println("WE ARE IN PARAMETERIZED CONSTRUCTOR");
    a=d;
    b=e;
    c=f;
    }
    public void display()
    {
    System.out.println("WE ARE IN METHOD display()");
    System.out.println("Value of a is "+a);
    System.out.println("Value of b is "+b);
    System.out.println("Value of c is "+c);
    }
    public int sum()
    {
    System.out.println("WE ARE IN METHOD sum()");
    int sum=a+b+c;
    return sum;
    }
    {
    System.out.println("WE ARE IN INSTANCE BLOCK");
    }
    static
    {
    System.out.println("WE ARE IN STATIC BLOCK");
    }
}
