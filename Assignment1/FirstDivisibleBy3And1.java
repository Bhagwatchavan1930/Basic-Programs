import java.util.Scanner;

class FirstDivisibleBy3And1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;

            if (lastDigit % 3 == 0 && lastDigit % 1 == 0) {
                System.out.println(lastDigit);
                break;
            }

            num /= 10;
        }
    }
}