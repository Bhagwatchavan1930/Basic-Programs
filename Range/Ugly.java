import java.util.Scanner;
class Ugly {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a start value:");
        int start = sc.nextInt();
        System.out.println("Enter a end value:");
        int end = sc.nextInt();

        for(int range = start; range <= end; range++) {
            int temp = range;

            while(temp % 2 == 0) {
                temp /= 2;
            }

            while(temp % 3 == 0) {
                temp /= 3;
            }

            while(temp % 5 == 0) {
                temp /= 5;
            }

            if(temp == 1) {
                System.out.println(range + " ugly Number");
            } 
        

    }
}
}
