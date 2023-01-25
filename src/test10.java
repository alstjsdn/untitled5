public class test10 {
    public static void main(String[] args){
    long answer = 0;
    int[] weights = {100,180,360,100,270};
    for (int i=0; i<weights.length; i++){
        int max = 0;
        int min = 0;
        for(int j = i+1; j<weights.length; j++) {
            if(weights[i]>weights[j]){
                max = weights[i];
                min = weights[j];
            }else {
                max =weights[j];
                min =weights[i];
            }
            for(int n=2; n<=4; n++) {
                if(max==min) {
                    answer++;
                    continue;
                }
                for(int k=n+1; n<=4; k++) {
                    if(max*n == min*k){
                        answer++;
                        break;
                    }
                }
            }

        }

    }
    System.out.print(answer);

}
}
