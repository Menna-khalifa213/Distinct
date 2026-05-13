package distinct;
import java.util.Scanner;
public class RunDistinct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = in.nextInt();

        int[] A = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            A[i] = in.nextInt();
        }
        DistinctRecursive recursiveSolver = new DistinctRecursive();
        DistinctNonRecursive nonRecursiveSolver = new DistinctNonRecursive();

        int recursiveResult = recursiveSolver.solution(A);
        int nonRecursiveResult = nonRecursiveSolver.solution(A);

        System.out.println("Distinct values from recursive algorithm: " + recursiveResult);
        System.out.println("Distinct values from non-recursive algorithm: " + nonRecursiveResult);
        in.close();
    }
}
