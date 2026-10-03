package practice;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while(num > 0){
            int digit = num % 2;;
            binary = binary + digit * place;
            num /= 2;
            place = place * 10;

        }

        System.out.println(binary);
    }
}