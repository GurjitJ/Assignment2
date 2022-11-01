import java.util.Scanner;
public class Question1
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");

        number = sc.nextInt();

        if(number>0)
        {
            System.out.println("The number is positive.");
        }

        else if(number<0)
        {
            System.out.println("The number is negative.");
        }

        else
        {
            System.out.println("The number is neither positive nor negative.");
        }
    }
}