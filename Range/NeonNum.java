 
import java.util.Scanner;
class NeonNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Start value: ");
        int start = sc.nextInt();
         System.out.println("Enter a end value: ");
        int end = sc.nextInt();

        for(int range = start; range<= end; range++){
          

        int square = range * range;
        int sum = 0;

        while(square > 0){
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if(sum == range){
            System.out.println(range + " is a Neon Number");
        }
        else{
            System.out.println(range + " is not a Neon number");
        }
    }
    }
}