package Day5.JUnit.Advance.TestingPasswordStrengthValidator;

import Day5.JUnit.basic.TestingExceptionHandling.Calculator;

public class PasswordValidator {
    public boolean isValid(String password){
        if(password==null || password.length()<8){
            return  false;
        }
        boolean hasUppercase= false;
        boolean hasDigit= false;
        for(char ch:password.toCharArray()){
            if(Character.isUpperCase(ch)){
                hasUppercase=true;
            }
            if(Character.isDigit(ch)){
                hasDigit= true;
            }
            if (hasDigit && hasUppercase){
                return  true;
            }
        }
        return false;


    }
}
