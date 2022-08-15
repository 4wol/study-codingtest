package codility.lesson.maximum_slice_problem;

public class MaxProfit {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {23171, 21011, 21123, 21366, 21013, 21367})); // 356
    }

    public static int solution(int[] A) {
        int result = 0;

        if(A.length <= 1) {
            return 0;
        }

        int min = A[0];
        for (int i = 1; i < A.length; i++) {
            if(min > A[i]) {
                min = A[i];
            }else {
                if(result < A[i] - min) {
                    result = A[i] - min;
                }
            }
        }

        return result;


        /*
        // timeoout
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if(A[j] - A[i] > result) {
                    result = A[j] - A[i];
                }
            }
        }

        return result;
         */
    }
}
