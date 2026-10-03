import java.util.Scanner;

class MagicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;

        while (num > 9) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1) {
            System.out.println(temp + " is a Magic Number");
        } else {
            System.out.println(temp + " is not a Magic Number");
        }
    }
}