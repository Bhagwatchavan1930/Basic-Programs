import java.util.Scanner;

class Prime {
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
                System.out.println(range + " is a Prime Number");
            } 
        }
    }
}