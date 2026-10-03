import java.util.Scanner;

class Emirp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int count = 0;
 
            for (int i = 1; i <= range; i++) {
                if (range % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
 
                int num = range;
                int reverse = 0;

                while (num > 0) {
                    int digit = num % 10;
                    reverse = reverse * 10 + digit;
                    num = num / 10;
                }

                int revCount = 0;
 
                for (int i = 1; i <= reverse; i++) {
                    if (reverse % i == 0) {
                        revCount++;
                    }
                }

                if (revCount == 2 && range != reverse) {
                    System.out.println(range + " is an Emirp Number");
                } 
            }
        }
    }
}