import java.util.Scanner;

class DisariumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;
        int sum = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        num = temp;

        while (num > 0) {

            int digit = num % 10;
            int divide = 1;

            for (int i = 1; i <= count; i++) {
                divide = divide * digit;
            }

            sum = sum + divide;

            count--;
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a Disarium Number");
        } else {
            System.out.println(temp + " is not a Disarium Number");
        }
    }
}