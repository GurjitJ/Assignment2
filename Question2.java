import java.util.Scanner;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.println("Enter a character ");
        ch=sc.next().charAt(0);

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.print(ch+" is in the Alphabet ");
        }
        else
        {
            System.out.print(ch+" is not in the Alphabet ");
        }
    }
}