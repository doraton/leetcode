package transposeMatrix;

import java.util.Arrays;

/*
867.
 */
public class Solution {
    public int[][] transpose(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int [][] transposed=new int[n][m];
        for (int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
//主函数
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        Solution ex=new Solution();
        int[][] transposed=ex.transpose(nums);
        for(int i=0;i<transposed.length;i++)
            System.out.println(Arrays.toString(transposed[i]));
    }
}
