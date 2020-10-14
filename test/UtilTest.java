import calculations.LuhnAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    // tests checkLengthOfUserInput()
    @Test
    void isInputCreditCardLengthSixteen(){
        String userCardNo = "1234561234561234";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertTrue(result == userCardNo.length() + " (Credit card)");
    }

    @Test
    void isInputCreditCardLengthLess(){
        String userCardNo = "123456789";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertFalse(result == userCardNo.length() + " (Not valid format for credit card)");
    }


/*
    // test if input is a string. userInput()
    @Test
    void isString(){
        luhnAlgorithm.setUserCardNo("");
        assertNotEquals("", luhnAlgorithm.userInput());
        //assertFalse(luhnAlgorithm.userInput().isEmpty()));

    }


 */
    // tests if checksum is valid. checksumValidation()
    @Test
    void isChecksumValid(){

    }

    // tests if the expected  check digit is valid. computingCheckDigit()
    @Test
    void isExpectedValid(){

    }
    // Tests the validation of the luhn formula for credit card validation. luhnCalculator()
    @Test
    void isValidationValid(){

    }

}