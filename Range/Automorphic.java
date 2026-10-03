import java.util.Scanner;

class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range;
            int square = range * range;
            int temp = range;
            int count = 0;

            
            while (num > 0) {
                count++;
                num = num / 10;
            }

            int divide = 1;
 
            for (int i = 1; i <= count; i++) {
                divide = divide * 10;
            }

            int res = square % divide;

            if (res == temp) {
                System.out.println(temp + " is an Automorphic Number");
            }  
        }
    }
}