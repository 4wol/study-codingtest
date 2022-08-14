package codility.lesson.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3})); // 0, 2, 4, 6, 7
        System.out.println(solution(new int[] {1, 2, 1})); // 0, 2
        System.out.println(solution(new int[] {2147483647})); // 0
    }

    public static int solution(int[] A) {
        if(A.length == 1) {
            return 0;
        }

        int half = A.length/2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if(map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);

                if(map.get(A[i]) > half) {
                    return i;
                }
            }else {
                map.put(A[i], 1);
            }
        }

        return -1;
    }
}
