import java.util.Scanner;

class TechNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        if (count % 2 == 0) {

            int divide = 1;

            for (int i = 1; i <= count / 2; i++) {
                divide = divide * 10;
            }

            int first = temp / divide;
            int second = temp % divide;

            int sum = first + second;
            int square = sum * sum;

            if (square == temp) {
                System.out.println(temp + " is a Tech Number");
            } else {
                System.out.println(temp + " is not a Tech Number");
            }

        } else {
            System.out.println(temp + " is not a Tech Number");
        }
    }
}