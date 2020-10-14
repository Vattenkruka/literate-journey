package calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuhnAlgorithm {

    public static String userCardNo;

    //userInput --> creditCardNumber
    public void userInput() {
        Scanner input = new Scanner(System.in);
        try {
            userCardNo = input.nextLine();
            getLastDigitOfCardNo();
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
        }
    }

    public int lengthOfUserInput() {
        return userCardNo.length();
    }

    public static boolean luhnCalculator() {
        int sumOfDigits = 0;
        boolean everyOtherDigit = false;
        for (int i = userCardNo.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(userCardNo.substring(i, i + 1));

            if (everyOtherDigit) {
                digit *= 2;
                if (digit > 9) {
                    int sum = 0;
                    sum += digit / 10;
                    sum += digit % 10;

                }
            }
            sumOfDigits += digit;
            everyOtherDigit = !everyOtherDigit;
        }
        System.out.println(sumOfDigits);
        return (sumOfDigits % 10 == 0);
    }


    public int getLastDigitOfCardNo(){
        int lastDigit = Integer.parseInt(userCardNo.substring(userCardNo.length()-1));
        return lastDigit;
    }

    public String checkSumValidation(){
        if(luhnCalculator()){
            return "Valid";
        }
        return "Not valid";
    }

    public String checkLengthOfUserInput(){
        if(lengthOfUserInput() == 16){
            return "(Credit card)";
        }
        return "(Not valid format for credit card)";
    }

}
