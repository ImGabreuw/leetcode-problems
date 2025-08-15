package print_2D_array_in_spiral_order;

public class Solution {

    /**
     * Print 2D array in spiral order
     * <p>
     * T -> 2  4   6   8
     *      5  9   12  16
     *      2  11  5   9
     * B -> 3  2   1   8
     *      ^          ^
     *      |          |
     *      L          R
     * <p>
     * T -> 5  9   12  16
     * 2  11  5   9
     * B -> 3  2   1   8
     * ^          ^
     * |          |
     * L          R
     * <p>
     * Output: 2 4 6 8 16 9 8 1 2 3 2 5 9 12 5 11
     */

    enum Direction {
        RIGHT, DOWN, LEFT, UP
    }

    public void printSpiral(int[][] matrix) {
        Direction direction = Direction.RIGHT;
        int top = 0; // linha 0
        int bottom = matrix.length - 1; // ultima linha
        int left = 0; // coluna 0
        int right = matrix[0].length - 1; // ultima coluna

        while (top <= bottom && left <= right) {
            if (direction == Direction.RIGHT) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
                direction = Direction.DOWN;
            } else if (direction == Direction.DOWN) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
                direction = Direction.LEFT;
            } else if (direction == Direction.LEFT) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
                direction = Direction.UP;
            } else if (direction == Direction.UP) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
                direction = Direction.RIGHT;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {2, 4, 6, 8},
                {5, 9, 12, 16},
                {2, 11, 5, 9},
                {3, 2, 1, 8}
        };

        Solution solution = new Solution();
        solution.printSpiral(matrix);
    }

}