package userInteraction;

import calculations.LuhnAlgorithm;

import java.util.Scanner;

public class UserInput {

    /* userInput for a creditCardNumber */
    public static String handleUserInput(String userCardNo) {
/*
        Scanner input = new Scanner(System.in);
        String userCardNo = input.nextLine();

 */
        try {
            long userCardNoToInt =  Long.parseLong(userCardNo);
            System.out.println("Input: " + userCardNo.substring(0, userCardNo.length() - 2) +
                    " " + LuhnAlgorithm.getLastDigitOfCardNo(userCardNo));

        } catch (NumberFormatException ex) {
            System.out.println("Not a valid input, please enter only digits.");
            return "Not a valid input, please enter only digits.";
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return userCardNo;
        }
    }

