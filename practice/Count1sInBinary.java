package practice;
import java.util.Scanner;
public class Count1sInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        int count=0;

        while(num > 0){
            int ld = num % 2;
            if(ld == 1){
                count++;
            }
            num /= 2;
        }

        System.out.println(count);
    }
}
