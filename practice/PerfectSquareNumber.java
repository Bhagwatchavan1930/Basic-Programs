import java.util.Scanner;
public class PerfectSquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean flag = false;

        for(int i=1; i<=num; i++) {
            if(i*i == num) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("perfectSquare Number");
        }
        else {
            System.out.println("Not PerfectSquare Number");
        }

    }
    
}
