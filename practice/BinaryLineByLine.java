import java.util.Scanner;

public class BinaryLineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();

        

        while(num > 0){
            int ld = num % 2;
            System.out.println(ld);
            num /= 2;
            
        }

    }
}