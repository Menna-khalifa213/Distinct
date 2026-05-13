package distinct;
import java.util.HashSet;
import java.util.Set;

public class DistinctRecursive {

    public int countDistinctRecursive(int[] A, int index, Set<Integer> distinctSet) {
        
        if (A.length == 0 || index >= A.length)
            return distinctSet.size();

        if (!distinctSet.contains(A[index])) {
            distinctSet.add(A[index]);
        }

        return countDistinctRecursive(A, index + 1, distinctSet);
    }

    public int solution(int[] A) {
        Set<Integer> emptySet = new HashSet<>();
        return countDistinctRecursive(A, 0, emptySet);
    }

    // test
//    public static void main(String[] args) {
//        DistinctRecursive sol = new DistinctRecursive();
//
//        int[] A = {2, 1, 1, 2, 3, 1};
//
//        System.out.println(sol.solution(A)); // 3
//    }
}