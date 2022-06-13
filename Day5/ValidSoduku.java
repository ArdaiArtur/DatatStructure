package Day5;

import java.util.HashSet;

public class ValidSoduku {
    public static void main(String[] args) {
        
    }

    public static boolean isValidSudoku(char[][] board) {
     HashSet<Character>hs=new HashSet<Character>();
     int x=0;
     for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if(board[i][j]!='.'&&!hs.add(board[i][j]))
            return false;
        }
        hs.clear();
        for (int j = 0; j < board[0].length; j++) {
            if(board[j][i]!='.'&&!hs.add(board[j][i]))
            return false;
        }
        hs.clear();
        if(i!=0 && i%3==0   )
        {
            x+=3;
        }
        for (int j =x; j < x+3; j++) {
            for (int j2 = i%3*3; j2 < i%3*3+3 ; j2++) {
                if(board[j][j2]!='.'&&!hs.add(board[j][j2]))
                return false;
            }
        }
        hs.clear();
     }
     return true;   
    }
}
