public class Task_5 {
    public static void main(final String[] args) {
        final int row = 2;
        final int column = 3;
        final int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
        System.out.println("Current matrix is : ");
        output(matrix);
        System.out.println("Transponed matrix is : ");
        final int[][] transMat = transpose(matrix, row, column);
        output(transMat);
        }

    public static int[][] transpose(final int[][] matrix, final int row, final int column) {
        final int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void output(final int[][] matrix) {
        for(final int[] row : matrix) {
            for (final int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
