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

    public int computingCheckDigit() {
        int sumOfDigits = 0;
        boolean everyOtherDigit = true;
        for (int i = userCardNo.length() - 2; i >= 0; i--) {
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

        return (10 - (sumOfDigits % 10));

    }

    public int getLastDigitOfCardNo() {
        int lastDigit = Integer.parseInt(userCardNo.substring(userCardNo.length() - 1));
        return lastDigit;
    }

    public String checkSumValidation() {
        if (getLastDigitOfCardNo() == computingCheckDigit()) {
            return "Valid";
        } else {
            return "Not valid";
        }
    }

    public String checkLengthOfUserInput() {
        if (userCardNo.length() == 16) {
            return userCardNo.length() + " (Credit card)";
        }
        return userCardNo.length() + " (Not valid format for credit card)";
    }

}
