import java.util.Scanner;

class Tech {
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

            while (num > 0) {
                count++;
                num = num / 10;
            }
 
            if (count % 2 == 0) {

                int divide = 1;

                // Calculate 10^(count/2)
                for (int i = 1; i <= count / 2; i++) {
                    divide = divide * 10;
                }

                int first = range / divide;
                int second = range % divide;

                int sum = first + second;
                int square = sum * sum;

                if (square == temp) {
                    System.out.println(temp + " is a Tech Number");
                } 
               

            } 
        }
    }
}