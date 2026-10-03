package practice;
import java.util.Scanner;
class HarshadNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        if(temp % sum == 0){
            System.out.println(temp + " is a harshad Number");
        }
        else{
            System.out.println(temp + " is not Harshad Number");
        }

    }
}