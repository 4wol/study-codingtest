package codility.lesson.time_complexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 1, 2, 4, 3})); // 1
        System.out.println(solution(new int[] {3, 1})); // 2
        System.out.println(solution(new int[] {-3, 1})); // 4
        System.out.println(solution(new int[] {3, -1})); // 4
        System.out.println(solution(new int[] {-3, -1})); // 2
        System.out.println(solution(new int[] {-300, -1000, 5000})); // 4300
    }

    public static int solution(int[] A) {
        int result = 0;

        int leftSum = 0;
        int rightSum = 0;

        int baseValue;
        for (int i = 0; i < A.length-1; i++) {
            baseValue = A[i];
            leftSum += A[i];

            if(i == 0) {
                for (int j = 1; j < A.length; j++) {
                    rightSum += A[j];
                }
            }else {
                rightSum -= baseValue;
            }

            if(i == 0 || result > Math.abs(leftSum - rightSum)) {
                result = Math.abs(leftSum - rightSum);
            }
        }

        return result;


        /*
        int result = 0;

        for (int i = 1; i < A.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += A[j];
            }

            for (int j = i; j < A.length ; j++) {
                rightSum += A[j];
            }

            if(i == 1 || result > Math.abs(leftSum - rightSum)) {
                result = Math.abs(leftSum - rightSum);
            }
        }

        return result;
         */
    }
}
