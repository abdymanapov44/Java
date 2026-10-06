public class DigitCount {
    public static void main(String[] args) {
        int number = 50280;

        if (number < 0) {
            System.out.println("Number must be non-negative");
        } else {
            int value = number;
            int digits = 0;

            if (value == 0) {
                digits = 1;
            } else {
                while (value > 0) {
                    value /= 10;
                    digits++;
                }
            }

            System.out.println("Digits: " + digits);
        }
    }
}
