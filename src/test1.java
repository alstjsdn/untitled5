import java.util.HashSet;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int []arr = new int[10];
        HashSet<Integer> set = new HashSet<>();
        Scanner scan =new Scanner(System.in);
        for(int i=0; i<10; i++) {
            System.out.print("숫자 입력 :");
            int num = scan.nextInt();
            arr[i] = num;
        }

        for(int ar:arr) {
            set.add(ar);
        }

        System.out.print(set);


    }
}
