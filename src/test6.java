import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num = scan.nextInt();
        int count = 0;
        int num3 = num;
        int ten;
        while(true) {
            int num2 = 0;
            num2 = num3/10+num3%10;
            num3 = num3%10*10 + num2%10;
            count++;
            if(num3 == num) {
                break;
            }
        }

        System.out.print(count);
    }
}
