package practice;
import java.util.Scanner;
class SpyNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        int temp = num;

        int addition = 0;
        int product = 1;

        while(num > 0){
            int digit = num % 10;
            addition += digit;
            product *= digit;
            num /= 10;
        }

        if(addition == product){
            System.out.println(temp + " is a SPY Number");
        }
        else{
            System.out.println(temp + " is not a SPY Number");
        }
    }
}