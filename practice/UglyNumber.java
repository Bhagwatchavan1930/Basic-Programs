import java.util.Scanner;
class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        int temp = num;

            while(num % 2 == 0) {
                num /= 2;
            }

            while(num % 3 == 0) {
                num /= 3;
            }

            while(num % 5 == 0) {
                num /= 5;
            }

            if(num == 1) {
                System.out.println(temp+ "ugly Number");
            } else {
                System.out.println(temp+ "Not Ugly Number");
            }
        

    }
}
