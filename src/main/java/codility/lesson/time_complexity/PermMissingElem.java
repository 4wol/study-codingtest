package codility.lesson.time_complexity;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 3, 1, 5})); // 4
        System.out.println(solution(new int[] {})); // 1
        System.out.println(solution(new int[] {1})); // 2
        System.out.println(solution(new int[] {1, 3})); // 2
        System.out.println(solution(new int[] {1, 2, 3, 4, 6})); // 5
        System.out.println(solution(new int[] {1, 2, 3, 4, 5})); // 6
        System.out.println(solution(new int[] {2})); // 1
    }

    public static int solution(int[] A) {
        if(A.length == 0) {
            return 1;
        }

        int result = A.length + 1;

        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(i+1 != A[i]) {
                result = i+1;
                break;
            }
        }

        return result;
    }
}
