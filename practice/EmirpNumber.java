import java.util.Scanner;

class EmirpNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {

            int temp = num;
            int reverse = 0;

            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp = temp / 10;
            }

            int revCount = 0;

            for (int i = 1; i <= reverse; i++) {
                if (reverse % i == 0) {
                    revCount++;
                }
            }

            if (revCount == 2 && num != reverse) {
                System.out.println(num + " is an Emirp Number");
            } else {
                System.out.println(num + " is not an Emirp Number");
            }

        } else {
            System.out.println(num + " is not an Emirp Number");
        }
    }
}