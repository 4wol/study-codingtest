package codility.lesson.counting_elements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4})); // 6
        System.out.println(solution(5, new int[] {1, 3})); // -1
        System.out.println(solution(3, new int[] {1, 3})); // -1
        System.out.println(solution(3, new int[] {1, 2, 4, 6, 7, 8})); // -1
        System.out.println(solution(1000, new int[] {1, 2, 4, 6, 7, 8, 1000})); // -1
        System.out.println(solution(3, new int[] {1, 3, 1, 3, 2, 1, 3})); // 4
    }

    public static int solution(int X, int[] A) {
        int result = -1;

        Set<Integer> base = new HashSet<>();
        for (int i = 0; i < A.length ; i++) {
            if(X >= A[i]) {
                base.add(A[i]);
            }

            if(base.size() == X) {
                result = i;
                break;
            }
        }

        return result;
    }
}
