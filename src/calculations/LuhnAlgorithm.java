package calculations;

public class LuhnAlgorithm {

    public static boolean luhnCalculator(String userCardNo) {
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

    public static int computingCheckDigit(String userCardNo) {
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

    public static int getLastDigitOfCardNo(String userCardNo) {

        int lastDigit = Integer.parseInt(userCardNo.substring(userCardNo.length() - 1));
        return lastDigit;
    }

    public static String checkSumValidation(String userCardNo) {
        if (getLastDigitOfCardNo(userCardNo) == computingCheckDigit(userCardNo)) {
            return "Valid";
        } else {
            return "Not valid";
        }
    }

    public static String checkLengthOfUserInput(String userCardNo) {
        if (userCardNo.length() == 16) {
            return userCardNo.length() + " (Credit card)";
        }
        return userCardNo.length() + " (Not valid format for credit card)";
    }
}
