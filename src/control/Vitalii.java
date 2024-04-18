package control;

public class Vitalii {
    private static final int[][] board = {
            {0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1}
    };

    private static final int[][] ships = {
            {0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 1}
    };

    private static final int n = board.length;
    private static final int m = board[0].length;

    public static void main(String[] args) {
        int numMoves = 0;

        while (!allShipsDestroyed(ships)) {
            int[] move = generateRandomMove();
            int row = move[0];
            int col = move[1];

            if (ships[row][col] == 1) {
                ships[row][col] = 0; // "Отразить" атаку
            }

            numMoves++;
        }

        System.out.println("Количество ходов: " + numMoves);
    }

    public static boolean allShipsDestroyed(int[][] ships) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ships[i][j] == 1) { // Проверяем, остались ли еще целые корабли
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] generateRandomMove() {
        int[] move = new int[2];
        move[0] = (int) (Math.random() * n);
        move[1] = (int) (Math.random() * m);
        return move;
    }
}
