package lesson_3_TimeComplexity;

public class TypeEquilibrium {
    public int solution(int[] A){
        int summ1 = A[0];
        int summ2 = 0;
        int result;

        for (int i = 1; i < A.length; i++) {
            summ2 += A[i];
        }

        result = Math.abs(summ1 - summ2);

        for (int i = 1; i < A.length-1; i++) {
            summ1 += A[i];
            summ2 -= A[i];

            if (result > Math.abs(summ1 - summ2)){
                result = Math.abs(summ1 - summ2);
            }
        }
        return result;
    }
}
