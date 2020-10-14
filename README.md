# Luhn's Algorithm program

## About the project
 #### The program uses the Luhn Algorithm to perform a simple checksum on the last digit of the user input.
 #### When executed the application will display the following: 
 
For example, providing 4242424242424242:

Input: 424242424242424 2

Provided: 2

Expected: 2


Checksum: Valid

Digits: 16 (credit card)

## Getting Started

### Installation
1. Clone the repo
git clone https://github.com/Vattenkruka/literate-journey.git

2. Open the project in your preferred IDE. We recommend Intellij.

3. To run the project, navigate to the "main" class, right click and "run main".

## Usage
In this section you can find some examples of usage of code
 
 Calculation of check digit of a credit card:
  ```
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
  ```
  
The program also features several test cases, for instance:
```
 @Test
    void isInputCreditCardLengthSixteen(){
        String userCardNo = "1234561234561234";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertTrue(result == userCardNo.length() + " (Credit card)");
    }
```
```
 @Test
    void isInputCreditCardLengthLess(){
        String userCardNo = "123456789";
        String result = LuhnAlgorithm.checkLengthOfUserInput(userCardNo);
        assertFalse(result == userCardNo.length() + " (Not valid format for credit card)");
    }
```
## Authors
[Paria Karim](https://github.com/lillap) & [Oscar Dahlquist](https://github.com/Vattenkruka)
