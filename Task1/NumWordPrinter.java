public class NumWordPrinter {

    public String printWord(int number, boolean uppercase) {
        String result;

        if (number % 2 == 0 && number % 11 == 0 && number % 13 == 0) {
            result = "EvenPrimeLucky";
        } else if (number % 2 == 0 && number % 11 == 0) {
            result = "EvenPrimeEleven";
        } else if (number % 2 == 0) {
            result = "Even";
        } else if (number % 11 == 0) {
            result = "PrimeEleven";
        } else if (number % 13 == 0) {
            result = "LuckyThirteen";
        } else {
            result = "OddOneOut";
        }

        return uppercase ? result.toUpperCase() : result;
    }

}
