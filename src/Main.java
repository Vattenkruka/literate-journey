import calculations.LuhnAlgorithm;

import java.util.Scanner;

public class Main {

    /* userInput --> creditCardNumber */
    public static String userInput() {

        Scanner input = new Scanner(System.in);
        String userCardNo = input.nextLine();
        try {

            LuhnAlgorithm.getLastDigitOfCardNo(userCardNo);
            System.out.println("Input: " + userCardNo.substring(0, userCardNo.length()-2) +
                    " " + LuhnAlgorithm.getLastDigitOfCardNo(userCardNo));

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            input.close();
            return userCardNo;
        }
    }
    public static void main(String[] args) {

        System.out.println("Please enter your credit card number: ");
        String userCardNo = userInput();
        System.out.println("Provided: " + LuhnAlgorithm.getLastDigitOfCardNo(userCardNo));
        System.out.println("Expected: " + LuhnAlgorithm.computingCheckDigit(userCardNo));
        System.out.println(" ");

        System.out.println("Checksum: " + LuhnAlgorithm.checkSumValidation(userCardNo));
        System.out.println("Digits: " + " " + LuhnAlgorithm.checkLengthOfUserInput(userCardNo));

    }

}
