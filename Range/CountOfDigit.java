import java.util.Scanner;

class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range;
            int count = 0;

            while (num > 0) {
                int digit = num % 10;
                count++;
                num = num / 10;
            }

            System.out.println(range + " has " + count + " digits");
        }
    }
}