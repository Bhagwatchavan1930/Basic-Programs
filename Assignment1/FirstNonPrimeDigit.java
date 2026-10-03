import java.util.Scanner;

class FirstNonPrimeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;

            if (lastDigit == 0 || lastDigit == 1 ||
                lastDigit == 4 || lastDigit == 6 ||
                lastDigit == 8 || lastDigit == 9) {
                System.out.println(lastDigit);
                break;
            }

            num /= 10;
        }
    }
}