import calculations.LuhnAlgorithm;
import org.junit.jupiter.api.Test;
import userInteraction.UserInput;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    /*Check that input is a string which is convertable to long, means that input is only digits*/
    @Test
    void isHandleUserInputValid() {
        String userCardNo = "1234561234561234";
        String result = UserInput.handleUserInput(userCardNo);
        assertEquals(userCardNo, result);
    }

/*Checks that a not a valid input is return if input isn't convertable to long */
    @Test
    void isUserInputNotConvertableToLong(){
        String userCardNo = "Not a valid input, please enter only digits.";
        String result = UserInput.handleUserInput(userCardNo);
        assertEquals(userCardNo, result);
    }

    // tests that the length of input is 16 charachters long and confirming with output credit card. checkLengthOfUserInput()
    @Test
    void isInputCreditCardLengthSixteen(){
        String userCardNo = "1234561234561234";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertEquals(userCardNo.length() + " (Credit card)", result);
    }

    /*checks that a shorter input than 16 characters return not valid message */
    @Test
    void isInputCreditCardLengthLess(){
        String userCardNo = "123456789";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertFalse(result == userCardNo.length() + " (Not valid format for credit card)");
    }

    @Test
    void isLastDigitOfCard(){
        String userCardNo = "123456789";
        int result = LuhnAlgorithm.getLastDigitOfCardNo(userCardNo);
        assertEquals(result, 9);
    }

    @Test
    void isLastDigitOfCardANumber(){}

    // tests if input is a string. userInput()
    @Test
    void isChecksumNotValid(){
        String userCardNO = "125151";
        String result = LuhnAlgorithm.validateCheckDigit(userCardNO);
        assertTrue(result == "Not valid");
    }

    // tests if checksum is valid. checksumValidation()
    @Test
    void isChecksumValid(){
    String userCardNO = "4242424242424242";
    String result = LuhnAlgorithm.validateCheckDigit(userCardNO);
    assertTrue(result != "Not valid");
    }

    
    @Test
    void isExpectedDigitInvalid() {
        String userCardNo = "4242424242424244";
        int result = LuhnAlgorithm.computeCheckDigit(userCardNo);
        assertNotEquals(result, 4);
    }

    // Tests if the expected check digit is valid for a credit card. computingCheckDigit()
    @Test
    void isExpectedDigitValid(){
        String userCardNo = "4242424242424242";
        int result = LuhnAlgorithm.computeCheckDigit(userCardNo);
        assertEquals(2, result);
    }

    // Tests the Luhn formula for credit card validation. luhnCalculator()
    @Test
    void isLuhnCalculationValid(){
        String userCardNo = "4242424242424242";
        boolean result = LuhnAlgorithm.calculateLuhnAlgorithm(userCardNo);
        assertTrue(result);

    }

    @Test
    void isLuhnCalculationInvalid(){
        String userCardNo = "1234561234561234";
        boolean result = LuhnAlgorithm.calculateLuhnAlgorithm(userCardNo);
        assertFalse(result);
    }

}