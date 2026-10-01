package TwoDimensionalArray;

public class identityMatrix {
    public static boolean isIdentity(int[][] matrix) {

        int n = matrix.length;

        if (matrix[0].length != n) {
            return false;
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i == j && matrix[i][j] != 1) {
                    return false;
                }

                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
