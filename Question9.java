import java.util.Scanner;
class Question9
{
    public static void main(String[] args)
    {
        double units;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of units");

        units = sc.nextDouble();

        double bill=0;

        if(units<=60)
            bill=units*0.3;

        else if(units<150 && units>60)
            bill=(60*0.3)+((units-60)*0.75);

        else if(units<=300 && units>150)
            bill=(60*0.3) + (90 *0.75) + ((units-150)*1.1);
        else if(units>300)
            bill=units*2.5;
        double billSurcharge = bill * 0.2;
        double billTotal = bill + billSurcharge;

        System.out.println("The amount you have to pay for your bill is: " + billTotal);
    }
}