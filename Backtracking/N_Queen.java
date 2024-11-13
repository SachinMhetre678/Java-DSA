
public class NQueens {

    // Method to solve the N-Queens problem
    public static boolean solveNQueens(int board[][], int row) {
        int N = board.length;

        // Base case: If all queens are placed, return true
        if (row >= N) {
            return true;
        }

        // Try placing the queen in each column of the current row
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place the queen

                // Recurse to place the rest of the queens
                if (solveNQueens(board, row + 1)) {
                    return true;
                }

                board[row][col] = 0; // Backtrack and remove the queen
            }
        }

        // If the queen cannot be placed in any column in this row, return false
        return false;
    }

    // Helper method to check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;

        // Check the column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check the upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Method to print the board
    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4; // Change this for different sizes
        int[][] board = new int[N][N];

        if (solveNQueens(board, 0)) {
            System.out.println("Solution for " + N + "-Queens:");
            printBoard(board);
        } else {
            System.out.println("No solution exists for " + N + "-Queens.");
        }
    }
}
