package TwoDimensionalArray;

public class multiplication {
    static int[][] multiply(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;

        int rowsB = B.length;
        int colsB = B[0].length;

        // Matrix multiplication is possible only when:
        // columns of A == rows of B
        if (colsA != rowsB) {
            throw new IllegalArgumentException(
                    "Matrix multiplication not possible"
            );
        }
        // Result size = rowsA × colsB
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {

                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 4}
        };
        int[][] B = {
                {5, 6},
                {7, 8}
        };
        int[][] result = multiply(A, B);
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("\nMatrix B:");
        printMatrix(B);
        System.out.println("\nA × B:");
        printMatrix(result);
    }
}