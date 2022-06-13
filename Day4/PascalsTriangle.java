package Day4;

import java.util.ArrayList;

import java.util.List;

public class PascalsTriangle {
    
    public static void main(String[] args) {
        
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>fin=new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List <Integer>cur=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1)
                {
                    cur.add(1);
                }
                else
                cur.add(fin.get(i-2).get(j-1)+fin.get(i-2).get(j));
            }
            fin.add(cur);

        }
        return fin;
    }
}
