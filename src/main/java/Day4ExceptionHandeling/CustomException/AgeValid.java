package Day4ExceptionHandeling.CustomException;
import java.util.*;

public class AgeValid {
    public static void validAge(int age) throws InvalidAgeException{
         if(age<18){
             throw new InvalidAgeException("Age must be 18 or above");

         }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the age: ");
            int age = sc.nextInt();
            validAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Invaild ! input . Please enter a vaild age.");
        }
        sc.close();
    }

}
