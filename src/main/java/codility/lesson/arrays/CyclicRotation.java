package codility.lesson.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4}, 4)));

        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, -1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 6)));
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 10)));
    }

    public static int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        if(A.length == 0 || A.length == K || K == 0 || K%A.length == 0) {
            return A;
        }

        for (int i = 0; i < A.length ; i++) {
            result[(i + K) % A.length] = A[i];
        }

        return result;

        /*
        int[] result = new int[A.length];

        if(A.length == 0 || A.length == K || K == 0 || K % A.length == 0) {
            return A;
        }

        if(K > A.length) {
            K = K % A.length;
        }

        // K > 0
        if(K > 0) {
            int j = 0;
            for (int a : A) {
                if(j + K >= A.length) {
                    j = 0;
                    K = 0;
                }

                result[K + j] = a;
                j++;
            }
        }
        // K < 0
        else {
            int j = A.length;
            for (int a : A) {
                if(j + K >= A.length) {
                    j = 0;
                    K = 0;
                }

                result[K + j] = a;
                j++;
            }
        }

        return result;
         */
    }
}
