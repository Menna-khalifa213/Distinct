package distinct;
    public class DistinctNonRecursive {

    public int solution(int[] A) {

        if (A.length == 0)
            return 0;

        int OFFSET = 1_000_000;
        int SIZE = 2_000_001;

        boolean[] hash = new boolean[SIZE];

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            int index = A[i] + OFFSET;

            if (!hash[index]) {
                hash[index] = true;
                count++;
            }
        }

        return count;
    }
//test
//    public static void main(String[] args) {
//        DistinctNonRecursive sol = new DistinctNonRecursive();
//
//        int[] A = {2, 1, 1, 2, 3, 1};
//
//        System.out.println(sol.solution(A)); // 3
//    }
}

