public class TicketPrice {
    public static void main(String[] args) {
        int age = 20;
        boolean isStudent = true;
        double basePrice = 12.0;
        double price;

        if (age < 12) {
            price = 5.0;
        } else if (age >= 65) {
            price = 7.0;
        } else if (isStudent) {
            price = 9.0;
        } else {
            price = basePrice;
        }

        System.out.println("Price: " + price);

        // Suggested test cases:
        // child: age = 10, isStudent = true  -> 5.0
        // senior: age = 70, isStudent = false -> 7.0
        // adult student: age = 20, isStudent = true -> 9.0
        // adult non-student: age = 30, isStudent = false -> 12.0
    }
}
