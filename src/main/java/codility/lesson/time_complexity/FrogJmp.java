package codility.lesson.time_complexity;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D); // 올림

        /*
        int result = 0;

        Y -= X;

        if(Y%D == 0) {
            result = Y/D;
        }else {
            result = Y/D+1;
        }

        return result;
         */
    }
}
