import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("문자 입력 :");
        String st = scan.nextLine();
        String[] arr = new String[st.length()];
        String str = "";

        for(int i=0; i<st.length(); i++) {
            arr[i] = String.valueOf(st.charAt(i));
        }
        for(int j=st.length()-1; j>=0; j--) {
            str += arr[j];
        }

        System.out.print(str);
    }
}
