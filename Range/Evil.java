import java.util.Scanner;

class Evil {
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

                int digit = num % 2;

                if (digit == 1) {
                    count++;
                }

                num = num / 2;
            }

            if (count % 2 == 0) {
                System.out.println(range + " is an Evil Number");
            } 
        }
    }
}