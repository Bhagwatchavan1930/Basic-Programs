package practice;
import java.util.Scanner;

public class InnerDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        num /= 10;
        int sum = 0;

        while(num > 9){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of inner digits are : " + sum);
    }
}