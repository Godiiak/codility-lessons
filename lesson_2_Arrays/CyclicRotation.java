package lesson_2_Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K){
        if(K > A.length & A.length != 0){
            K = K%A.length;
        }

        if(A.length >= 2){
            int[] B = new int[A.length];
            for (int i = 0; i < A.length; i++) {
                if(i >= A.length - K){
                    B[Math.abs(A.length - (i + K))] = A[i];
                } else {
                    B[i + K] = A[i];
                }
            }
            return B;
        }
        return A;
    }
}