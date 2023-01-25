import java.util.HashSet;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("문자 입력 :");
        String st = scan.nextLine();
        String[] arr = new String[st.length()];
        String str = "";

        for(int i=0; i<st.length(); i++) {
            String ng="";
            char ch =st.charAt(i);
            if(Character.isUpperCase(ch)) {
                ng=String.valueOf(Character.toLowerCase(ch));
            }else {
                ng = String.valueOf(Character.toUpperCase(ch));
            } arr[i] = ng;
        }
        for(String ch:arr) {
            str+=ch;
        }
        System.out.print(str);

    }
}
