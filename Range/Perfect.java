import java.util.Scanner;

class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int sum = 0;

            for (int i = 1; i < range; i++) {

                if (range % i == 0) {
                    sum += i;
                }
            }

            if (sum == range) {
                System.out.println(range + " is a Perfect Number");
            }  
        }
    }
}