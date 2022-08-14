package codility.lesson.prefix_sums;

public class PassingCars {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0, 1, 0, 1, 1})); // 5
        System.out.println(solution(new int[] {0}));
        System.out.println(solution(new int[] {1}));
        System.out.println(solution(new int[] {1, 0}));
    }

    public static int solution(int[] A) {
        long result = 0;

        int eastCar = 0;
        for (int j : A) {
            if (j == 0) {
                eastCar++;
            } else {
                result += eastCar;
            }
        }

        return result > 1000000000 ? -1 : (int) result;



        /*
        // 성능 X
        int result = 0;

        for (int i = 0; i < A.length ; i++) {
            if(A[i] == 0) {
                for (int j = i+1; j < A.length; j++) {
                    if(A[j] == 1) {
                       result++;
                    }
                }
            }
        }

        return result > 1000000000 ? -1 : result;
         */
    }
}
