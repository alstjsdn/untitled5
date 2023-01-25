import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학생수 입력 :");
        int student = scan.nextInt();
        int[] jum = new int[student];
        double avg = 0;
        int count = 0;
        double fur;
        for(int i=0; i<student; i++) {
            System.out.print(i+1+"번째 학생의 점수 :");
            int su = scan.nextInt();
            jum[i] = su;
            avg += su;
        }avg /= student;

        for(int s:jum) {
         if(s>avg) {
             count++;

         }
        }
        fur =((double)count/(double)student)*100;
        System.out.print("평균은"+avg+"이고 평균보다 점수가 높은 학생수는"+count+"명 입니다. 비율은:"+fur);

    }

}
