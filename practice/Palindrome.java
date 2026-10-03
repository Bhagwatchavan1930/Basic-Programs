package practice;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if(temp == rev){
            System.out.println(temp + " is a palindrome number");
        }
        else{
            System.out.println(temp + " is not a palindrome number");
        }
    }
}