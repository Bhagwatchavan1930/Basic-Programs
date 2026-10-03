package practice;
import java.util.Scanner;
class ProductOfEvenFactors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();


        int prod = 1;

        for(int i = 1; i <= num ; i++){
            if(num % i == 0 && i % 2 == 0){
                prod *= i;
            }
        }
        System.out.println(prod);





    }

}