import java.util.Scanner;
public class evenodd
{
        public static void main(String args[])
  {
                Scanner console = new Scanner(System.in);
        System.out.printf("Enter any number : ");
    int number = console.nextInt();
    if((number %2)==0)
                {
        System.out.printf("number %d is even number %n" , number);

    }
                else
                {
                 System.out.printf("number %d is odd number %n", number);
    }
                System.out.printf("Finding number if it's even or odd using bitwise AND operator %n");

                if( (number&1) == 0)
                                {
                 System.out.printf("number %d is even number %n" , number);
        }
                                else
                                {
            System.out.printf("number %d is odd number %n", number);
        }

    }


}
