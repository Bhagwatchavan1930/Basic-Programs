import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;

        while (num > 9) {

            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit * digit;
                num = num / 10;
            }

            num = sum;
        }

        if (num == 1) {
            System.out.println(temp + " is a Happy Number");
        } else {
            System.out.println(temp + " is not a Happy Number");
        }
    }
}