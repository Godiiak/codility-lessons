package lesson_4_CountingElements;

public class MaxCounters {
    public int[] solution(int N, int[] A){

        int maxValue = 0, initValue = 0;
        int[] result = new int[N];

        for(int i = 0; i < A.length; i++)
        {
            if(A[i] <= N && A[i] >= 1)
            {
                result[A[i]-1] = Math.max(initValue,result[A[i]-1]) + 1;
                maxValue = Math.max(maxValue,result[A[i]-1]);
            }else if(A[i] == N + 1)
            {
                initValue = maxValue;
            }
        }

        for(int i = 0; i < result.length; i++) {
            result[i] = Math.max(result[i], initValue);
        }
        return result;
    }
}
