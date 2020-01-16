package rotateMatrix;

public class rotateMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}};

        for (int[] x : matrix)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        rotateMatrix(matrix);
        System.out.println("\nrotated matrix, printing for checking");

        for (int[] x : rotateMatrix(matrix))
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    static int[][] rotateMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] rotate = new int[n][m];
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < n; b++) {
                rotate[b][m - 1 - a] = matrix[a][b];
            }
        }
        return rotate;
    }
}
