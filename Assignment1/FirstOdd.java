
import java.util.Scanner;


public class FirstOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        int ld = 0;
        while(num > 0) {
            ld = num % 10;
            if(ld % 2 != 0) {
                System.out.println(ld);
                break;
            }
            num /= 10;
        }
    }
}
