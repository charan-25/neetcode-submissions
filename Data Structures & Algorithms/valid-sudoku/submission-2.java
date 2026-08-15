class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }


        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                int digit = ((i/3)* 3) + (j/3);
                if(rows[i].contains(board[i][j]) ||
                   columns[j].contains(board[i][j]) ||
                   boxes[digit].contains(board[i][j]) ) return false;

                rows[i].add(board[i][j]);
                columns[j].add(board[i][j]);
                boxes[digit].add(board[i][j]);
            }
        }
        return true;
    }
}
