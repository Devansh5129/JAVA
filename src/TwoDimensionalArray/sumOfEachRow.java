package TwoDimensionalArray;

public class sumOfEachRow {
    public static void rowSums(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            int sum = 0;

            for (int j = 0; j < matrix[i].length; j++) {

                sum += matrix[i][j];
            }

            System.out.println("Row " + i + " = " + sum);
        }
    }
    public static void columnSums(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {

            int sum = 0;

            for (int i = 0; i < rows; i++) {

                sum += matrix[i][j];
            }

            System.out.println("Column " + j + " = " + sum);
        }
    }
}
