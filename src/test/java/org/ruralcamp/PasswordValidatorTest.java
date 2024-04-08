package org.ruralcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    public void passwordValidator() throws Exception{
        Assertions.assertTrue(passwordValidator.isValid("Abcdefg1_"));
    }

    @Test
    public void passwordValidatorIsFalseWithMoreThan8Characters() {
        Assertions.assertFalse(passwordValidator.isValid("Abcdefg"));
    }

    @Test
    public void passwordValidatorIsFalseWithACapitalLetter() {
        Assertions.assertFalse(passwordValidator.isValid("abcdefg1_"));
    }

    @Test
    public void passwordValidatorIsFalseIfNotContainsALowerCase() {
        Assertions.assertFalse(passwordValidator.isValid("ABCDEFG1_"));
    }


    
    @Test
    public void passwordValidatorIsFalseIfNotContainsADigit() {
        Assertions.assertFalse(passwordValidator.isValid("ABCDEFGh"));
    }

    @Test
    public void passwordValidatorIsFalseIfNotContainsANumber() {
        Assertions.assertFalse(passwordValidator.isValid("ABCDEFGh_"));
    }
}