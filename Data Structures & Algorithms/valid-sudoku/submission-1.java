class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<Character>[] rows = new HashSet[9];
        Set<Character>[] columns = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for (int k = 0; k < 9; k++) {
            rows[k] = new HashSet<>();
            columns[k] = new HashSet<>();
            boxes[k] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];

                if (digit == '.') {
                    continue; // skip empty cells
                }

                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i].contains(digit) ||
                    columns[j].contains(digit) ||
                    boxes[boxIndex].contains(digit)) {
                    return false;
                }

                rows[i].add(digit);
                columns[j].add(digit);
                boxes[boxIndex].add(digit);
            }
        }

        return true;
    }
}
