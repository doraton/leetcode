package toeplitzMatrix;
/*
766.
m是矩阵的行数，n是矩阵的列数
从2行2列开始遍历，只与自己左上的那个数字进行比较，不同则false
这种矩阵叫做拓普利兹矩阵
 */
public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
//主方法
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        Solution ex=new Solution();
        System.out.println(ex.isToeplitzMatrix(matrix));
    }
}
