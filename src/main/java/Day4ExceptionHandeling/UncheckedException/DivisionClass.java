package Day4ExceptionHandeling.UncheckedException;
import java.util.*;
public class DivisionClass {
    public static double divisbleNumber(double numerator, double denominator){
        if(denominator==0){
            throw new ArithmeticException( "Cannot divide by zero! ");
        }
        return numerator/denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the numerator " );
            double numerator= sc.nextDouble();

            System.out.println("Enter the denominator: ");
            double denominator = sc.nextDouble();

            double result= divisbleNumber(numerator, denominator);
            System.out.println("Result: "+ result);
        }
        catch(ArithmeticException e){
            System.out.println("Error" +e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Invaild input number! please input valid number "+ e);
        }
        sc.close();
    }
}
