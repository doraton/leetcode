package flippingaAnImage;

import java.util.Arrays;
/*
832.
异或运算符^=,两值不同取1，相同取0
遍历二维数组，
左右指针指向的数相等（都为0，或都为1）则不用反转，直接异或
左右指针指向的数不等（左0右1，或是左1右0），则反转异或后结果与原值一样，不做操作
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                //左右指针都是0或都是1
                if (A[i][left] == A[i][right]) {
                    A[i][left] ^= 1;
                    A[i][right] ^= 1;
                }
                left++;
                right--;
            }
            //左右指针指向同一个数
            if (left == right) {
                A[i][left] ^= 1;
            }
        }
        return A;
    }
    //主函数
    public static void main(String[] args) {
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        Solution ex=new Solution();
        int[][] B=ex.flipAndInvertImage(A);
        for(int i=0;i<A.length;i++)
            System.out.println(Arrays.toString(B[i]));
    }
}
