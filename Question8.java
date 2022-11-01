
import java.util.Scanner;
public class Question8
{
    public static void main(String[] args)
    {
        double income,tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");
        income=sc.nextDouble();
        if(income<250000)
            tax=0;
        else if(income>=250000 && income<600000)
            tax=(0.1*income);
        else if(income>=600000 && income<1200000)
            tax=(0.18*income);

        else
            tax=(0.25*income);
        System.out.println("Income tax amount is "+tax);
    }
}