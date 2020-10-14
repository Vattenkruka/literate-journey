package main;

import calculations.LuhnAlgorithm;

public class Main {

    public static void main(String[] args) {
        LuhnAlgorithm luhnAlgorithm = new LuhnAlgorithm();
        System.out.println("Please enter your credit card number: ");
        luhnAlgorithm.userInput();
        System.out.println("Provided: " + luhnAlgorithm.getLastDigitOfCardNo());
        System.out.println("Expected: ");
        System.out.println(" ");

        System.out.println("Checksum: " + luhnAlgorithm.checkSumValidation());
        System.out.println("Digits: " + luhnAlgorithm.lengthOfUserInput() + " " + luhnAlgorithm.checkLengthOfUserInput());

	// write your code here
    }

}
