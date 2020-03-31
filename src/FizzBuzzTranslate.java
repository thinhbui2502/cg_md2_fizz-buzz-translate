public class FizzBuzzTranslate {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static String showFizzBuzz(int number) {
        boolean isFizzNumber = number % 3 == 0;
        boolean isBuzzNumber = number % 5 == 0;
        if (isFizzNumber && isBuzzNumber) {
            return FIZZ_BUZZ;
        } else if (isBuzzNumber) {
            return BUZZ;
        }
        return FIZZ;
    }

    public static String translate(int number) {
        String translateNumber = "";
        if (number < 10) {
            translateNumber = translateNumberBelow10(number);
        } else {
            int phanDu = number % 10;
            int thuong = number / 10;
            translateNumber = translateNumberBelow10(thuong) + " " + translateNumberBelow10(phanDu);
        }
        return translateNumber;
    }

    private static String translateNumberBelow10(int number) {
        String translateNumber = "";
        switch (number) {
            case 1: {
                translateNumber = "one";
                break;
            }
            case 2: {
                translateNumber = "two";
                break;
            }
            case 3: {
                translateNumber = "three";
                break;
            }
            case 4: {
                translateNumber = "four";
                break;
            }
            case 5: {
                translateNumber = "five";
                break;
            }
            case 6: {
                translateNumber = "six";
                break;
            }
            case 7: {
                translateNumber = "seven";
                break;
            }
            case 8: {
                translateNumber = "eight";
                break;
            }
            case 9: {
                translateNumber = "nine";
                break;
            }
        }
        return translateNumber;
    }
}
