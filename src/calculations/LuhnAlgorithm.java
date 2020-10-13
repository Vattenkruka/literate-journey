package calculations;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LuhnAlgorithm {

    //userInput --> creditCardNumber
    public void userInput() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter your credit card number: ");
            int userDigits;
            userDigits = input.nextInt();

        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            input.close();
        }

    }
}
