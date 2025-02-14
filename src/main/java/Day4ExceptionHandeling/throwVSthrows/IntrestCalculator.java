package Day4ExceptionHandeling.throwVSthrows;
import java.util.*;
public class IntrestCalculator {
    public static double intrestCalculator(double ammount, double rate, int years) throws IllegalArgumentException{
        if(ammount<0 || rate<0){
            throw new IllegalArgumentException("Amount and Rate must be in Positive ");
        }
        return (ammount * rate * years)/100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the ammount ");
            double ammount=sc.nextDouble();
            System.out.println("Enter the rate ");
            double rate= sc.nextDouble();
            System.out.println("Enter the year");
            int yaers=sc.nextInt();

            double intrest=intrestCalculator(ammount,rate,yaers);
            System.out.println("Calculated intrest is :" +intrest);
        }
        catch(IllegalArgumentException e){
            System.out.println("Invalid !input " + e.getMessage());
        }
        sc.close();
    }
}
