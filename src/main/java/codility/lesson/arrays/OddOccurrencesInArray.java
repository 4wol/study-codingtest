package codility.lesson.arrays;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
        //System.out.println(solution(new int[] {9, 3, 9, 3, 9, 3, 10000}));
        //System.out.println(solution(new int[] {9, 3, 9, 3, 9, 5, 9}));
    }

    public static int solution(int[] A) {
        int result = 0;
        for (int num : A) {
            result ^= num;
        }
        return result;
    }
}
