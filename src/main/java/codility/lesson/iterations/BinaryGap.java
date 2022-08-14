package codility.lesson.iterations;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(1041));
        System.out.println(solution(32));
    }

    public static int solution(int N) {
        int result = 0;
        int curResult = 0;

        String num = Integer.toBinaryString(N); // 2진 변환

        char[] arr = num.toCharArray(); // string to array

        for (char a : arr) {
            if(a == '1') {
                if(result < curResult) {
                    result = curResult;
                }
                curResult = 0;
                continue;
            }

            curResult += 1;
        }

        return result;
    }

}
