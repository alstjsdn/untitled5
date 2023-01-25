import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class test9 {
    public static void main(String[] args) {
        HashSet<Integer> arr =new HashSet<>();
        int[] numbers = {5,0,2,7};


        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                arr.add(numbers[i] + numbers[j]);
            }
        }
        List<Integer> arr2 = new ArrayList<Integer>(arr);
        Collections.sort(arr2);
        System.out.print(arr2);
    }
}
