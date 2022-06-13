package Day5;

import java.util.HashSet;

public class ValidSoduku {
    public static void main(String[] args) {
        
    }

    public boolean isValidSudoku(char[][] board) {
     HashSet<Character>hs=new HashSet<Character>();
     for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if(!hs.add(board[i][j]))
            return false;
        }
        hs.clear();
        for (int j = 0; j < board[0].length; j++) {
            if(!hs.add(board[j][i]))
            return false;
        }
        hs.clear();
        
     }   
    }
}
