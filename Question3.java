import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int dividend , divisor, quotient, remainder;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of dividend: ");
        dividend = sc.nextInt();

        System.out.print("Enter the value of divisor: ");
        divisor = sc.nextInt();

        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + remainder);
    }
}