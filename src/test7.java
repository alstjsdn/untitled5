import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 :");
        int num1 = scan.nextInt();
        System.out.print("숫자 입력 :");
        int num2 = scan.nextInt();

        String Snum1 =Integer.toString(num1);
        String Snum2 =Integer.toString(num2);

        String[] Sarr1 = new String[Snum1.length()];
        String[] Sarr2 = new String[Snum1.length()];

        String Sn1 ="";
        String Sn2 ="";
        for(int i=0; i<Snum1.length(); i++) {
            Sarr1[i] = String.valueOf(Snum1.charAt(Snum1.length() - 1-i));
        }
        for(int i=0; i<Snum2.length(); i++) {
            Sarr2[i] = String.valueOf(Snum2.charAt(Snum2.length() - 1-i));
        }

        for(String arr:Sarr1) {
            Sn1 +=arr;
        }
        for(String arr2:Sarr2) {
            Sn2 +=arr2;
        }
        num1=Integer.parseInt(Sn1);
        num2=Integer.parseInt(Sn2);

        if(num1>num2) {
            System.out.print(num1+">"+num2);
        }else
            System.out.print(num2+">"+num1);




        }



    }


