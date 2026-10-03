import java.util.Scanner;

public class Sunny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Start value:");
        int start = sc.nextInt();

        System.out.println("Enter an End value:");
        int end = sc.nextInt();

        for (int range = start; range <= end; range++) {

            int num = range + 1;
            boolean flag = false;

            for (int i = 1; i <= num; i++) {
                if (i * i == num) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(range + " is a Sunny Number");
            }  
        }
    }
}