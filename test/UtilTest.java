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


    // tests if input is a string. userInput()
    @Test
    void isChecksumNotValid(){
        String userCardNO = "125151";
        String result = LuhnAlgorithm.checkSumValidation(userCardNO);
        assertTrue(result == "Not valid");

    }

    // tests if checksum is valid. checksumValidation()
    @Test
    void isChecksumValid(){
    String userCardNO = "4242424242424242";
    String result = LuhnAlgorithm.checkSumValidation(userCardNO);
    assertTrue(result != "Not valid");
    }


    @Test
    void isExpectedDigitInvalid() {
        String userCardNo = "4242424242424244";
        int result = LuhnAlgorithm.computingCheckDigit(userCardNo);
        assertNotEquals(result, 4);

    }

    // Tests if the expected check digit is valid. computingCheckDigit()
    @Test
    void isExpectedDigitValid(){
        String userCardNo = "4242424242424242";
        int result = LuhnAlgorithm.computingCheckDigit(userCardNo);
        assertEquals(2, result);


    }
    // Tests the Luhn formula for credit card validation. luhnCalculator()
    @Test
    void isLuhnCalculationValid(){
        String userCardNo = "4242424242424242";
        boolean result = LuhnAlgorithm.luhnCalculator(userCardNo);
        assertTrue(result);

    }

    @Test
    void isLuhnCalculationInvalid(){
        String userCardNo = "1234561234561234";
        boolean result = LuhnAlgorithm.luhnCalculator(userCardNo);
        assertFalse(result);
    }

}