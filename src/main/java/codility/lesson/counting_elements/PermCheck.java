package codility.lesson.counting_elements;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4, 1, 3, 2})); // 1
        System.out.println(solution(new int[] {4, 1, 3})); // 0
        System.out.println(solution(new int[] {4, 1, 3, 2, 10, 9, 8, 7, 6, 5})); // 1
        System.out.println(solution(new int[] {4, 1, 3, 2, 10, 9, 8, 7, 6, 5, 100})); // 0
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if(i+1 != A[i]) {
                return 0;
            }
        }

        return 1;
    }
}
