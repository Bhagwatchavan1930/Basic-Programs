import java.util.Scanner;

class FirstPrimeGreaterThan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;

            if (lastDigit == 5 || lastDigit == 7) {
                System.out.println(lastDigit);
                break;
            }

            num /= 10;
        }
    }
}