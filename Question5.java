import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number grade of the student: ");
        grade = sc.nextInt();

        System.out.print("The students grade is: ");
        if(grade>=90)
        {
            System.out.print("A");
        }
        else if(grade>=75 && grade<90)
        {
            System.out.print("B");
        }
        else if (grade>=65 && grade<75)
        {
            System.out.print("C");
        }
        else
        {
            System.out.println("F");
        }

        }
    }
