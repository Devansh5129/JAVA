package TwoDimensionalArray;

public class SpriralTraversal {
        public static void spiralPrint(int[][] matrix) {

            int rows = matrix.length;
            int cols = matrix[0].length;

            int top = 0;
            int bottom = rows - 1;
            int left = 0;
            int right = cols - 1;

            while (top <= bottom && left <= right) {

                // 1. Top row: Left -> Right
                for (int j = left; j <= right; j++) {
                    System.out.print(matrix[top][j] + " ");
                }
                top++;

                // 2. Right column: Top -> Bottom
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;

                // 3. Bottom row: Right -> Left
                if (top <= bottom) {
                    for (int j = right; j >= left; j--) {
                        System.out.print(matrix[bottom][j] + " ");
                    }
                    bottom--;
                }

                // 4. Left column: Bottom -> Top
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(matrix[i][left] + " ");
                    }
                    left++;
                }
            }
        }

        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            System.out.println("Spiral Traversal:");

            spiralPrint(matrix);
        }
    }
