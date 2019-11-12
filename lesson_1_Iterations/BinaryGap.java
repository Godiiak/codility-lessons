package lesson_1_Iterations;

public class BinaryGap {
    public int solution (int N){
        int result = 0;
        int temp = 0;
        char[] chars = Integer.toBinaryString(N).toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == '1' & chars[i+1] == '0') {
                temp++;
            } else if(chars[i] == '0' & chars[i+1] == '1'){
                if(result < temp){
                    result = temp;
                }
                temp = 0;
            } else if (chars[i] == '0' & chars[i+1] == '0'){
                temp++;
            }
        }
        return result;
    }
}