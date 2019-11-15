package lesson_4_CountingElements;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A){
        if(A.length == 1 & A[0] > 1){
            return 1;
        }

        Arrays.sort(A);

        if (A.length > 1 & A[0] > 1){
            return 1;
        }

        int temp = -1;

        for (int j = 0; j < A.length; j++){
            if(A[j] > 0){
                temp = j;
                break;
            }
        }

        if (temp == -1){
            return 1;
        }

        if(A.length-1 == temp & A[temp] == 1000000){
            return 1;
        }

        for (int i = temp; i < A.length-1; i++) {
            if(A[i+1] != A[i] & A[i+1] != A[i]+1){
                return A[i]+1;
            }
        }
        return A[A.length-1]+1;
    }
}
