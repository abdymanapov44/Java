public class Countdown {
    public static void main(String[] args) {
        int n = 10;

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("Lift off!");

        System.out.println();
~
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Lift off!");
    }
}
