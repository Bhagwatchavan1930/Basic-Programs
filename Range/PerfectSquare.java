import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            boolean flag = false;

            for (int i = 1; i <= range; i++) {

                if (i * i == range) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(range + " is a Perfect Square Number");
            } 
        }
    }
}