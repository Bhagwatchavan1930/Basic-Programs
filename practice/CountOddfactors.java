package practice;
import java.util.Scanner;
class CountOddfactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();


        int count = 0;

        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0 && i % 2 != 0){
                count++;
            }
        }

        System.out.println(count);
    }
}