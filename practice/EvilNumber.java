import java.util.Scanner;

class EvilNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 2;

            if (digit == 1) {
                count++;
            }

            num = num / 2;
        }

        if (count % 2 == 0) {
            System.out.println(temp + " is an Evil Number");
        } else {
            System.out.println(temp + " is not an Evil Number");
        }
    }
}