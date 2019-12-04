package lesson_5_PrefixSums;

public class PassingCars {
    public int solution(int[] A){
        int carTravelingToEast = 0;
        int counterPassingCars = 0;

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0){
                carTravelingToEast++;
            } else {
                counterPassingCars += carTravelingToEast;
            }

            if(counterPassingCars > 1000000000){
                return -1;
            }
        }
        return counterPassingCars;
    }
}
