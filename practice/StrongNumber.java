import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        int sum = 0;
        int temp = num;

        while(num > 0) {
            int ld = num % 10;
            int fact = 1;

            for(int i=1; i<=ld; i++) {
                fact = fact * i;

            }
            sum = sum + fact;
             num /=10;

        }
        if(temp == sum) {
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not Strong Number");
        }
    }
    
}
