import java.util.Scanner;

class Harshad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a start value: ");
        int start = sc.nextInt();
        System.out.println("Enter a end value: ");
        int end = sc.nextInt();

        for(int range = start; range <= end; range++) {

        int temp = range;
        int num = range;
        int sum = 0;

        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        if(temp % sum == 0){
            System.out.println(temp + " is a harshad Number");
        }
        else{
            System.out.println(temp + " is not Harshad Number");
        }

        }  

    }

}