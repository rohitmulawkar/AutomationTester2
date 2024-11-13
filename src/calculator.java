import java.util.Scanner;
public class Calculator {
    public static void main (String [] args)
    {
        System.out.println("Welcome to Rohit's two number Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation to be performed  + for Addition - subtration , * for devision ,/ for division,% for Modulus");
        String opr = sc.next();
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println ("Enter number 2");
        int num2= sc.nextInt();

        switch(opr)
        {
            case "+" : System.out.println (" Addition of two number is " + (num1 +num2));break;
            case "*" :System.out.println (" Multiplication of two number is " + (num1 *num2));break;
            case "/" : System.out.println (" Division of two number is " + (num1 /num2));break;
            case "-" : System.out.println(" Subtraction of two number is " + (num1 -num2));break;
            case "%" : System.out.printf(" Reminder after dividing %d by %d  of two number is %d ",num1,num2, (num1 % num2));break;
            default  :System.out.println ("Invalid input");break;
        }
    }
}
