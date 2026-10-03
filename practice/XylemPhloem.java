import java.util.Scanner;

class XylemPhloem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int outerDigitSum = num % 10;
        int InnerDigitSum = 0;
        num /= 10;
        int temp = num;

        while(num > 9) {
            int digit = num % 10;
            InnerDigitSum += digit;
            num /= 10; 
        }

        outerDigitSum += num;

        if (outerDigitSum == InnerDigitSum) {
            System.out.println(temp+ "Xylem Number");
        } else {
            System.out.println(temp+ "pholem Number");
        }

    }
}