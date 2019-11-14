package lesson_4_CountingElements;

import java.util.Arrays;

public class PermCheck {
    public int solution(int[] A){
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(A[i] != i + 1){
                return 0;
            }
        }

        if(A.length == A[A.length-1]){
            return 1;
        }else {
            return 0;
        }
    }
}
