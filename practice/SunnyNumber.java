import java.util.Scanner;
public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean flag = false;

        num += 1;

        for(int i=1; i<=num; i++) {
            if(i*i == num) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println(num+ "Sunny Number");
        }
        else {
            System.out.println(num+ "Not Sunny Number");
        }

    }
    
}
