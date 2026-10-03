package practice;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int decimal = 0;
        int place = 1;

        while(num > 0){
            int digit = num % 10;;
            decimal = decimal + digit * place;
            num /= 10;
            place = place * 2;

        }

        System.out.println(decimal);
    }
}