package codility.lesson.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1})); // 3
        System.out.println(solution(new int[] {2, 1, 1, 3, 3, 1})); // 2
        System.out.println(solution(new int[] {})); // 0
        System.out.println(solution(new int[] {1})); // 1
        System.out.println(solution(new int[] {-1, 0, -2, -1, 0})); // 3
        System.out.println(solution(new int[] {0, 1, 2})); // 3
    }

    public static int solution(int[] A) {
        Set<Integer> result = new HashSet<>();

        for (int a : A) {
            result.add(a);
        }

        return result.size();
    }
}
