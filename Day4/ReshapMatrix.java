package Day4;

public class ReshapMatrix {
    public static void main(String[] args) {
        int[][]mat=new int[][]{
            {1,2,3},
            {4,5,6},{7,8,9}};
        int[][]m=matrixReshape(mat, 9, 1);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length==r&& mat[0].length==c)
        return mat;
        if(mat.length* mat[0].length!=c*r)
        return mat;
           int[][]mat2=new int[r][c];
        int a=0,b=0;
        for (int i = 0; i < mat.length; i++) {
           for (int j = 0; j < mat[0].length; j++) {
                
               mat2[a][b]=mat[i][j];
                    b++;
                     if(b==c)
                   {b=0;
                   a++;}     
           }
        } 
        return mat2;  
     } 
     
    }

