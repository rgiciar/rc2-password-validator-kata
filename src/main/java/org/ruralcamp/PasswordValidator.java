package org.ruralcamp;


public class PasswordValidator {
    
    public Boolean isValid(String password) {
        if (password.length()<8){
            return false;
        }

        if (password.toLowerCase().equals(password)) {
            return false;
        }

        if (password.toUpperCase().equals(password)) {
            return false;
        }

        for (char c : password.toCharArray()){
            if (Character.isDigit(c)) {
                return true;
            }
        }

        return false;
    }
}