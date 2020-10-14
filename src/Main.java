import calculations.LuhnAlgorithm;
import userInteraction.UserInput;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.print("Please enter your credit card number: ");
        Scanner input = new Scanner(System.in);
        String userCardNo = input.nextLine();

        userCardNo = UserInput.handleUserInput(userCardNo);

        if (!userCardNo.equals("Not a valid input, please enter only digits.")) {
            System.out.println("Provided: " + LuhnAlgorithm.getLastDigitOfCardNo(userCardNo));
            System.out.println("Expected: " + LuhnAlgorithm.computeCheckDigit(userCardNo));
            System.out.println(" ");

            System.out.println("Checksum: " + LuhnAlgorithm.validateCheckDigit(userCardNo));
            System.out.println("Digits: " + " " + LuhnAlgorithm.checkLengthOfUserInput(userCardNo));
        }
        input.close();
    }

}
