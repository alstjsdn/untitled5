import java.util.HashSet;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int length =Integer.toString(num).length();
        int []arr=new int[length];
        String Snum =Integer.toString(num);
        boolean check =true;

        for (int i=0; i<length; i++) {
            arr[i]=Snum.charAt(i);
        }
        for(int j=0; j<arr.length; j++) {
            if(arr[j]==arr[length-1-j]) {
                continue;
            }else
                check=false;
        }

        System.out.print(check);
    }
}
