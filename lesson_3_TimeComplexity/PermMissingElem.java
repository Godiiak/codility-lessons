package lesson_3_TimeComplexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        int missingElem;

        if (A.length == 1) {
            if (A[0] != 1) {
                missingElem = 1;
            } else {
                missingElem = 2;
            }
        } else {
            for (int i = 0; i < A.length; i++) {
                if (A[i] != i + 1) {
                    return i + 1;
                }
            }
            missingElem = A.length + 1;
        }

        return missingElem;
    }
}
