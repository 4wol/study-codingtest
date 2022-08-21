package codility.lesson.prime_and_composite_numbers;

public class CountFactors {

    public static void main(String[] args) {
        System.out.println(solution(1) == 1); // 1
        System.out.println(solution(2) == 2); // 2
        System.out.println(solution(3) == 2); // 2
        System.out.println(solution(4) == 3); // 3 -> 1, 2, 4
        System.out.println(solution(24) == 8); // 8
        System.out.println(solution(780291637) == 2); // 2
    }

    public static int solution(int N) {
        int result = 0;

        if(N == 1) {
            return 1;
        }

        int max = (int) Math.sqrt(N);
        for (int i = 1; i <= max; i++) {
            if(N % i == 0) {
                if(i == N / i) {
                    result = result + 1;
                }else {
                    result = result + 2;
                }
            }
        }

        return result;

        /*
        // timeout
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if(N % i == 0) {
                result++;
            }
        }
        return result;
         */
    }
}
