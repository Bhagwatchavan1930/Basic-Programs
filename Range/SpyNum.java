
import java.util.Scanner;

class SpyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start Value: ");
        int start = sc.nextInt();

        System.out.println("Enter End Value: ");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range;

            int addition = 0;
            int product = 1;

            while (num > 0) {
                int digit = num % 10;

                addition += digit;
                product *= digit;

                num /= 10;
            }

            if (addition == product) {
                System.out.println(range + " is a SPY Number");
            }
            //  else {
            //     System.out.println(range + " is not a SPY Number");
            // }
        }
    }
}