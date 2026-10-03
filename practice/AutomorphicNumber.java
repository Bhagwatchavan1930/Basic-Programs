import java.util.Scanner;

class AutomorphicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = num;
        int square = num * num;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        int divide = 1;

        for (int i = 1; i <= count; i++) {
            divide = divide * 10;
        }

        int res = square % divide;

        if (res == temp) {
            System.out.println(temp + " is an Automorphic Number");
        } else {
            System.out.println(temp + " is not an Automorphic Number");
        }
    }
}