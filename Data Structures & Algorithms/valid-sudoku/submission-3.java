class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> rows = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;

                if(rows.contains(board[i][j])) return false;
                rows.add(board[i][j]);
            }
        }

        for(int j=0;j<9;j++){
            HashSet<Character> columns = new HashSet<>();
            for(int i=0;i<9;i++){
                if(board[i][j]=='.') continue;

                if(columns.contains(board[i][j])) return false;
                columns.add(board[i][j]);
            }
        }

        for(int sr=0;sr<9;sr=sr+3){
            int er = sr+2;
            for(int sc=0;sc<9;sc=sc+3){
                int ec = sc+2;
                if(traverse(board,sr,er,sc,ec)) return false;
            }
        }
        return true;
    }

    private boolean traverse(char[][] board,int sr,int er,int sc,int ec){
        HashSet<Character> box = new HashSet<>();
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                if(board[i][j]=='.') continue;

                if(box.contains(board[i][j])) return true;
                box.add(board[i][j]);
            }
        }
        return false;
    }
}
