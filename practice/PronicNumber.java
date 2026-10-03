import java.util.Scanner;
public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        boolean flag = false;

        for(int i=1; i<=num; i++) {
            if(i*(i + 1) == num) {
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("pronic Number");
        }
        else {
            System.out.println("Not Pronic Number");
        }

    }
    
}
