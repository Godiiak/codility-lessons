package lesson_3_TimeComplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D){
        int distance = Y - X;
        int result;

        if(distance == 0){
            return 0;
        }

        if (D >= distance){
            result = 1;
        } else {
            if (distance % D == 0){
                result = distance / D;
            }else {
                result = (distance / D) + 1;
            }
        }
        return result;
    }
}
