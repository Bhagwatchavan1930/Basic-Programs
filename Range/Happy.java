import java.util.Scanner;

class Happy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range;

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
                System.out.println(range + " is a Happy Number");
            }
            
        }
    }
}