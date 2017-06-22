import java.util.Scanner.*;
class factorial
{
  public static void main(String args[])
  {
    int n ,c ,fact;
    System.out.println("Enter the factorial number");
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
    if(n<0)
      System.out.println("Number should be Negative");
    else
    {
        for(c=1;c<=n;c++)
        fact= fact * c;
        System.out.println("Factorial of "+n+" is = " +fact);
    }
  }
}
