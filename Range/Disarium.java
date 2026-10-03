import java.util.Scanner;

class Disarium  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range;
            int temp = range;
            int count = 0;
            int sum = 0;

            while (num > 0) {
                count++;
                num = num / 10;
            }

            num = range;

            while (num > 0) {
                int digit = num % 10;

                int res = 1;

                for (int i = 1; i <= count; i++) {
                    res = res * digit;
                }

                sum = sum + res;
                count--;
                num = num / 10;
            }

            if (sum == temp) {
                System.out.println(temp + " is a Disarium Number");
            } 
        }
    }
}